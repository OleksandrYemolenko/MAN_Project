package com.example.pls;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ContentPageActivity extends AppCompatActivity{

    WebView wv;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentpage);

        pos = getIntent().getIntExtra("pos", 0) + 1;

        wv = (WebView)findViewById(R.id.webView);

        wv.loadUrl("file:///android_asset/" + "a" +Integer.toString(pos)+ ".html");
       // wv.loadUrl("file:///android_asset/a1.html");
    }
}
