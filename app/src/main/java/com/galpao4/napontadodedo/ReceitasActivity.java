package com.galpao4.napontadodedo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TabHost;

/**
 * Created by Luiz Carlos on 20/10/2015.
 */
public class ReceitasActivity extends AppCompatActivity {

    private TabHost myTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        myTabHost = (TabHost) findViewById(R.id.TabHost01);
        myTabHost.setup();

        TabHost.TabSpec spec = myTabHost.newTabSpec("tab_creation");
        spec.setIndicator("Nova Receita", getResources().getDrawable(android.R.drawable.ic_menu_add));
        spec.setContent(R.id.adicionar);
        myTabHost.addTab(spec);

        myTabHost.addTab(myTabHost.newTabSpec("tab_inser").setIndicator("Editar", getResources().getDrawable(android.R.drawable.ic_menu_edit)).setContent(R.id.editar));

        myTabHost.addTab(myTabHost.newTabSpec("tab_affiche").setIndicator("Receitas Cadastradas", getResources().getDrawable(android.R.drawable.ic_menu_view)).setContent(R.id.todos));
        ListView lv = (ListView) findViewById(R.id.listView1);
        //ReceitasActivity adapter = new ReceitasActivity(this);
        //lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_receitas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nova_categoria) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
