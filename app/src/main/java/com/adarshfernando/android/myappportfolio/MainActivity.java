
/*
* Adarsh Fernando - v0.1 - 10/31/2015
* This app will serve as a launchpad for other apps created in the Udacity Android Developers Nanodegree Program.
* Each app button will launch its respective app as it becomes available
* */

package com.adarshfernando.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);
    }

}
