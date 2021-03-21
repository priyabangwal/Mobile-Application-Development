package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView SUM;
    EditText NUMBER1, NUMBER2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SUM = findViewById(R.id.SUM);
        NUMBER1 = findViewById(R.id.NUMBER1);
        NUMBER2 = findViewById(R.id.NUMBER2);
    }

    public void addnumber(View v){
        double n1,n2,sum;

        n1 = Double.parseDouble(NUMBER1.getText().toString());
        n2 = Double.parseDouble(NUMBER2.getText().toString());

        sum = n1 + n2;

        SUM.setText(String.valueOf(sum));
    }

}