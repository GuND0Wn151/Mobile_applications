package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final int CAM_REQ=1888;
    Button b;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.b);
        im = (ImageView) findViewById(R.id.im);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cam,CAM_REQ);

            }
        });
    }
    protected void onActivityResult(int reqcode,int rescode,Intent data) {
        super.onActivityResult(reqcode, rescode, data);
        if (reqcode == CAM_REQ) {
            Bitmap pic = (Bitmap) data.getExtras().get("data");
            im.setImageBitmap(pic);
        }
    }
}
