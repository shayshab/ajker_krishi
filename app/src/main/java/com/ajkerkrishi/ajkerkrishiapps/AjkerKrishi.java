package com.ajkerkrishi.ajkerkrishiapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AjkerKrishi extends AppCompatActivity {
    private WebView abt;
    ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajker_krishi);

        this.abt = findViewById(R.id.about);
        image = findViewById(R.id.img);

        Picasso.get().load("http://shayshab.decoderssquad.com/ajker.png").into(image);


        setTitle("আজকের কৃষি");
        this.abt.loadUrl("file:///android_asset/ajkerkrishi.html");


    }
}
