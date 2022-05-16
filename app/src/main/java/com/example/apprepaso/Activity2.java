package com.example.apprepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView Nombrei2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Nombrei2= (TextView)findViewById(R.id.i2_text1);

        String nombre = getIntent().getStringExtra("nombre");
        Nombrei2.setText(nombre);
    }


}