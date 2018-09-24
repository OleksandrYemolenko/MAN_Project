//Made by Sasha nXXL Ermolenko with design consulting of Zhenya Goloven


package com.example.pls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

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
