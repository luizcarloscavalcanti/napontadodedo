package com.galpao4.napontadodedo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TabHost;

/**
 * Created by Luiz Carlos on 20/10/2015.
 */
public class PoupancaActivity extends AppCompatActivity {

    private TabHost myTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poupanca);

        myTabHost = (TabHost) findViewById(R.id.TabHost01);
        myTabHost.setup();

        TabHost.TabSpec spec = myTabHost.newTabSpec("tab_creation");
        spec.setIndicator("Nova Poupança", getResources().getDrawable(android.R.drawable.ic_menu_add));
        spec.setContent(R.id.adicionar);
        myTabHost.addTab(spec);

        myTabHost.addTab(myTabHost.newTabSpec("tab_inser").setIndicator("Editar", getResources().getDrawable(android.R.drawable.ic_menu_edit)).setContent(R.id.editar));

        myTabHost.addTab(myTabHost.newTabSpec("tab_affiche").setIndicator("Poupanças Cadastradas", getResources().getDrawable(android.R.drawable.ic_menu_view)).setContent(R.id.todos));
        ListView lv = (ListView) findViewById(R.id.listView1);
        //ReceitasActivity adapter = new ReceitasActivity(this);
        //lv.setAdapter(adapter);

    }

}
