package com.galpao4.napontadodedo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btnReceitas = (ImageView) findViewById(R.id.btn_receitas);
        ImageView btnGastos = (ImageView) findViewById(R.id.btn_gastos);
        ImageView btnPoupanca = (ImageView)findViewById(R.id.btn_poupanca);

        btnReceitas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ReceitasActivity.class);
                startActivity(it);
            }
        });

        btnGastos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, GastosActivity.class);
                startActivity(it);
            }
        });

        btnPoupanca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, PoupancaActivity.class);
                startActivity(it);
            }
        });
    }

}
