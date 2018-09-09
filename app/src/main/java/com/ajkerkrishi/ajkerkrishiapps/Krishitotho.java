package com.ajkerkrishi.ajkerkrishiapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Krishitotho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krishitotho);

        WebView wb = findViewById(R.id.webView1);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://www.ajkerkrishi.com/category/%E0%A6%95%E0%A7%83%E0%A6%B7%E0%A6%BF-%E0%A6%A4%E0%A6%A5%E0%A7%8D%E0%A6%AF-%E0%A6%B8%E0%A6%BE%E0%A6%B0%E0%A7%8D%E0%A6%AD%E0%A6%BF%E0%A6%B8/");

    }
}
