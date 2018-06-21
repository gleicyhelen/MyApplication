package com.example.gleic.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_confirm;
    EditText text;
    EditText edit_value;



    @Override
    protected void onCreate(Bundle SaveValue) {
        super.onCreate(SaveValue);
        setContentView(R.layout.activity_main);

        button_confirm = findViewById(R.id.button_confirm);
        text = findViewById(R.id.text);

        button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit_value = edit_value.getText().toString();

                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,SegundaTela.class);

                bundle.putString(edit_value);
                intent.putExtra(Bundle);
                startActivity(intent);
            }
        });

    }
}
