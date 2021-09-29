package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void second(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("value1","Hello");
        i.putExtra("value2","world");
        startActivity(i);

    }
}
