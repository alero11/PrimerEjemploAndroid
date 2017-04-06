package com.axa.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuperMercadoActivity extends AppCompatActivity {

    TextView txtNombreP;
    TextView txtDepartamentoP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_mercado);

        //Referenciamos

        txtNombreP = (TextView) findViewById(R.id.text_view_nombre_prod);
        txtDepartamentoP = (TextView) findViewById(R.id.text_view_departamento_prod);

        // obtenemos valores
        // Bundle donde se recibe como una bolsa
        Bundle mochila = getIntent().getExtras();
        String nombre = mochila.getString("NOMBRE_KEY");
        String departamento = mochila.getString("DEPARTAMENTO_KEY");

        txtNombreP.setText("BIENVENIDO... " + nombre);
        txtDepartamentoP.setText("Departamento "+departamento);
    }
}
