package com.example.buttonaddition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button ad,su,mul;
    EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad = (Button) findViewById(R.id.button1);
        su = (Button) findViewById(R.id.button2);
        mul = (Button) findViewById(R.id.button3);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        ed3 = (EditText) findViewById(R.id.ed3);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();

                ed3.setText(Integer.toString(Integer.parseInt(num1)+Integer.parseInt(num2)));
            }
        });
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                ed3.setText(Integer.toString(Integer.parseInt(num1)-Integer.parseInt(num2)));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                ed3.setText(Integer.toString(Integer.parseInt(num1)*Integer.parseInt(num2)));
            }
        });
    }
}
