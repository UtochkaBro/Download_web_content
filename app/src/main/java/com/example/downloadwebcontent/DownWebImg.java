package com.example.downloadwebcontent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DownWebImg extends AppCompatActivity {

    private ImageView imageView;
    private String url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/640px-American_Beaver.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_web_img);
        imageView = findViewById(R.id.imageView);
    }

    public void onClickDownImage(View view){

    }


}