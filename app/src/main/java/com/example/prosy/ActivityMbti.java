package com.example.prosy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class ActivityMbti extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti);

        webView = (WebView) findViewById(R.id.webView1);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://4brain.ru/blog/тест-на-тип-личности-маерс-бриггс/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }


}