package com.spnj.tugasfoodsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb);
        web();
    }
    public void web(){
        WebView browser = (WebView)findViewById(R.id.web);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("https://facebook.com");
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
