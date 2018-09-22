package com.example.pls;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ContentPageActivity extends AppCompatActivity{

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentpage);

        wv = (WebView)findViewById(R.id.webView);

        wv.loadUrl("file:///android_asset/" + "a2" + ".html");
       // wv.loadUrl("file:///android_asset/a1.html");
    }
}
