package com.senai.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (TextView)findViewById(R.id.resultado);
        Intent it = getIntent();
        float media = it.getFloatExtra("media", 0f);

        if(media >= 7){
            resultado.setText("Aprovado. Média: " + media);
        } else{
            resultado.setText("Reprovado. Média: " + media);
        }

        Button retornar = (Button)  findViewById(R.id.retornar);
        retornar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
    }
}