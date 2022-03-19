package com.example.devinsandoridflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActiviity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card_activiity);

        String s1 = getIntent().getStringExtra("stringKey1");
        String s2 = getIntent().getStringExtra("stringKey2");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("string1", s1);
                data.putExtra("string2", s2);
                setResult(RESULT_OK, data);
                finish();
            }
        });

        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = ((EditText) findViewById(R.id.editTextQuestion)).getText().toString();
                String string2 = ((EditText) findViewById(R.id.editTextAnswer)).getText().toString();

                Intent data = new Intent();
                data.putExtra("string1", string1);
                data.putExtra("string2", string2);
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}