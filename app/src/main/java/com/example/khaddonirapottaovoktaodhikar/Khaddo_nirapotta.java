package com.example.khaddonirapottaovoktaodhikar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Khaddo_nirapotta extends AppCompatActivity {

    WebView webview;
    String url = "www.bfsa.gov.bd/bn/images/pdf/The-Food-Safety-Act-2013.pdf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaddo_nirapotta);



        webview = findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());

//        System.out.println("id of user.............. : "+getUserId());
        webview.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
    }
}
