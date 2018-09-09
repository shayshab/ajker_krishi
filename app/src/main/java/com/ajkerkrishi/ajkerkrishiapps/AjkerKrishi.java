package com.ajkerkrishi.ajkerkrishiapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class AjkerKrishi extends AppCompatActivity {
    private WebView abt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajker_krishi);

        this.abt = findViewById(R.id.about);


        setTitle("আজকের কৃষি");
        this.abt.loadUrl("file:///android_asset/ajkerkrishi.html");


    }
}
