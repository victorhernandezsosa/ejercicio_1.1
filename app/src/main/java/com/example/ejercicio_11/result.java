package com.example.ejercicio_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {


    TextView mosresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mosresultado = (TextView) findViewById(R.id.resultado);

        Intent intent = getIntent();

        if (intent != null)
        {
            int resultado = intent.getIntExtra("resultado",0);
            mosresultado.setText(String.valueOf(resultado));
        }


    }
}