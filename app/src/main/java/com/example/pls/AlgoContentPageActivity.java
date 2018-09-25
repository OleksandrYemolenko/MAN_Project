package com.example.pls;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;

public class AlgoContentPageActivity extends AppCompatActivity {

    private WebView wv;
    private int pos;
    private String act, title;
    private View view;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_contentpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pos = getIntent().getIntExtra("pos", 0) + 1;
        act = getIntent().getStringExtra("act");
        title = getIntent().getStringExtra("title");



        setTitle(title);

        wv = (WebView)findViewById(R.id.webView);
        view = (View)findViewById(R.id.act_content);

        wv.loadUrl("file:///android_asset/" + act + Integer.toString(pos)+ ".html");
        // wv.loadUrl("file:///android_asset/a1.html");

        Slidr.attach(this);

    }

}
