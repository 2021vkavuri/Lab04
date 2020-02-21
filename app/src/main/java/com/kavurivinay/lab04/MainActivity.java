package com.kavurivinay.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    int layoutCounter;
    View[] layouts;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        layouts = [R.layout.activity_main1, R.layout.activity_main2, R.layout.activity_main3, R.layout.acitvity_main4, R.layout.activity_main5, R.layout.activity_main6, R.layout.activity_main7];
        layoutCounter = 1;
    }

    public void onClick(View v){
        layoutCounter++;
        if(layoutCounter > 7)
        {
            layoutCounter = 1;
        }
        setContentView(layouts[layoutCounter - 1]);
    }
}
