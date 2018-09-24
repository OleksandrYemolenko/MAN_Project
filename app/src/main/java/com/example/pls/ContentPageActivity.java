package com.example.pls;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class ContentPageActivity extends AppCompatActivity {

    private WebView wv;
    private int pos;
    private String act, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_contentpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pos = getIntent().getIntExtra("pos", 0) + 1;
        act = getIntent().getStringExtra("act");
        title = getIntent().getStringExtra("title");

        setTitle(title);

        wv = (WebView)findViewById(R.id.webView);

        wv.loadUrl("file:///android_asset/" + act + Integer.toString(pos)+ ".html");
        // wv.loadUrl("file:///android_asset/a1.html");

    }
}
