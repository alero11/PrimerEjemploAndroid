package com.axa.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    EditText txtNombre;
    Spinner txtDepartamento;
    Button btnEmpezar;
    String nombre="";
    String datos[] = new String[]{"La Paz", "Santa cruz", "Cochabamba", "Oruro", "Potosi"};
    String departament_escogido="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar nuestros objetos
        txtNombre = (EditText) findViewById(R.id.et_nombre);
        txtDepartamento = (Spinner) findViewById(R.id.sp_departamento);
        btnEmpezar = (Button) findViewById(R.id.btn_empezar);

        // configurar

        btnEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    nombre = txtNombre.getText().toString();
                    Toast.makeText(getApplicationContext(),"HOLA" + nombre, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Exitoooo!!!!!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this,SuperMercadoActivity.class);
                    intent.putExtra("NOMBRE_KEY",nombre);
                    intent.putExtra("DEPARTAMENTO_KEY",departament_escogido);
                    startActivity(intent);
            }
        });

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,datos);
        txtDepartamento.setAdapter(adaptador);
    }
}
