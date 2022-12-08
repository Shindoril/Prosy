package com.example.prosy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activityresultm extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityresultm);

        webView = (WebView) findViewById(R.id.webView1);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://hr-portal.ru/story/luchshie-professii-dlya-vashego-tipa-lichnosti-po-shkale-mayers-briggs");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }


}