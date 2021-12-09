package com.senai.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nota1;
    EditText nota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = (EditText)findViewById(R.id.nota1);
        nota1 = (EditText)findViewById(R.id.nota2);
    }

    public void calcularMedia(View v){
        float n1 = Float.parseFloat(nota1.getText().toString());
        float n2 = Float.parseFloat(nota2.getText().toString());

        float media = (n1+n2) / 2;

        Intent it = new Intent(this,MainActivity2.class);

        it.putExtra("media", media);

        startActivity(it);
    }
}