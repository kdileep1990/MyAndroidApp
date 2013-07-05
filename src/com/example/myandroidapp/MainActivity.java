package com.example.myandroidapp;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends /* Activity */DroidGap {

    // @Override
    // protected void onCreate(Bundle savedInstanceState) {
    // super.onCreate(savedInstanceState);
    // setContentView(R.layout.activity_main);
    // }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://192.168.2.3:8010/PracticePerfect");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

} 