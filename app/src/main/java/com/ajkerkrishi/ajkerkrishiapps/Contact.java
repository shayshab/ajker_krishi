package com.ajkerkrishi.ajkerkrishiapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Contact extends AppCompatActivity {

    WebView contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        setTitle("যোগাযোগ");

        // this.contact = (WebView) findViewById(R.id.c);




    }
}
