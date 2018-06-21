package com.example.gleic.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class SegundaTela extends AppCompatActivity {
    TextView exibir_texto;


    @Override
    protected void onCreate(Bundle SaveValue) {

        super.onCreate(SaveValue);
        setContentView(R.layout.activity_segunda_tela);

        exibir_texto = findViewById(R.id.exibir_texto);

        Bundle bundle = getIntent().getExtras();

        String text = bundle.getString("Valor", "Null" );

        exibir_texto.setText(text);
    }
}
