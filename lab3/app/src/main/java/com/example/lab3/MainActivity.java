package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        e1 = findViewById(R.id.name);
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                i.putExtra("msg1", e1.getText().toString());
                startActivity(i);
            }
        });
    }
}