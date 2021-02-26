package com.example.childactivitytomainacitivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Read String file*/



        /*
        *
        *
        * For Jumping any child Activity to Main Activity, Your must need to go Manifest file and
            with current child file you need to add android:"parentActivityName"=".MainActivity">
        *
        *
        * */

    }
}