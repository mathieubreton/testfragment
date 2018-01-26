package com.example.mbreton.testpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(getBaseContext()).load("https://image.tmdb.org/t/p/w500/5Iw7zQTHVRBOYpA0V6z0yypOPZh.jpg").into(imageView);


    }
}
