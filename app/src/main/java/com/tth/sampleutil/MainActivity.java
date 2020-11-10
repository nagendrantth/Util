package com.tth.sampleutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tth.util.InternetConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(new InternetConnection().isNetworkAvailable(getApplicationContext())){

        }
    }
}