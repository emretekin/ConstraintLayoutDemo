package com.emretekin.constraintlayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends AppCompatActivity {

    Button buttonFirst, buttonSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createViews();
        setListeners();

    }

    private void createViews(){
        buttonFirst = (Button) findViewById(R.id.buttonFirst);
        buttonSecond = (Button) findViewById(R.id.buttonSecond);
    }

    private void setListeners(){
        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityMain.this, ActivitySingleView.class);
                startActivity(i);
            }
        });

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityMain.this, ActivitySampleScreen.class);
                startActivity(i);
            }
        });

    }

}
