package com.example.gleic.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

private EditText edit_value;

public class SegundaTela extends MainActivity {
    protected void onCreate(Bundle SaveValue) {

        super.onCreate(SaveValue);
        setContentView(R.layout.activity_main);

        edit_value = findViewById(R.id.edit_value);

        Bundle bundle = getIntent().getExtras();

        String text = bundle.getString(getText(), "text");

        getText(text.edit_value);
    }
}
