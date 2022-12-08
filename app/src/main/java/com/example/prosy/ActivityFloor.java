package com.example.prosy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ActivityFloor extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);

        webView = (WebView) findViewById(R.id.webView1);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://rosuchebnik.ru/material/20-voprosov-kotorye-pomogut-vybrat-professiyu-/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }


}