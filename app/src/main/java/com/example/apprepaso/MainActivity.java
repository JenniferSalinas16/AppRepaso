package com.example.apprepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText c_numero1;
    private EditText c_numero2;
    private TextView c_respuesta;
    private EditText c_nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_numero1 = findViewById(R.id.i_editTextTextPersonName1);
        c_numero2 = findViewById(R.id.i_editTextTextPersonName2);
        c_respuesta = findViewById(R.id.i_textView2);
        c_nombre = findViewById(R.id.ei_ditTextTextPersonName3);
    }

    public void Sumar(View view){
        String n1 = c_numero1.getText().toString();
        String n2 = c_numero2.getText().toString();
        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);

        int suma = numero1 + numero2;

        String respuesta  = String.valueOf(suma);

        c_respuesta.setText(respuesta);



    }

    public void Siguiente(View view){

        // Para pasar de un activity a otro.

        String nombre = c_nombre.getText().toString();

        //Pasar al otro activity
        Intent salir = new Intent(this,Activity2.class );
        salir.putExtra("nombre", nombre);
        startActivity(salir);


    }
}