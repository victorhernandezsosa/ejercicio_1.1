package com.example.ejercicio_11;

import static com.example.ejercicio_11.R.id.resultado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsuma, btnresta, btndivision,btnmulti;
    EditText numero1,numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmulti = (Button) findViewById(R.id.btnmulti);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int res = n1 + n2;

                Intent intent = new Intent(getApplicationContext(),result.class);
                intent.putExtra("resultado",res);
                startActivity(intent);

            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int res = n1 * n2;

                Intent intent = new Intent(getApplicationContext(),result.class);
                intent.putExtra("resultado",res);
                startActivity(intent);
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int res = n1 - n2;

                Intent intent = new Intent(getApplicationContext(),result.class);
                intent.putExtra("resultado",res);
                startActivity(intent);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int res = n1 / n2;

                Intent intent = new Intent(getApplicationContext(),result.class);
                intent.putExtra("resultado",res);
                startActivity(intent);
            }
        });

    }
}