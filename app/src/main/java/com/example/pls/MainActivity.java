package com.example.pls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Algos(View v) {
        intent = new Intent(this, AlgoActivity.class    );
        startActivity(intent);
    }public void Math(View v) {
        intent = new Intent(this, MathActivity.class    );
        startActivity(intent);
    }public void Physics(View v) {
        intent = new Intent(this, PhysicsActivity.class    );
        startActivity(intent);
    }
}
