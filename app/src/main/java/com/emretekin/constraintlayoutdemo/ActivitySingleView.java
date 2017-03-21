package com.emretekin.constraintlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySingleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_imageview);
    }
}
