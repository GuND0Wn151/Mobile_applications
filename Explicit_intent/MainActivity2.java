package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras =getIntent().getExtras();
        Toast.makeText(getApplicationContext(), extras.getString("value1"), Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), extras.getString("value2"), Toast.LENGTH_SHORT).show();
    }
}