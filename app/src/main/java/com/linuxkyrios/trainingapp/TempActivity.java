package com.linuxkyrios.trainingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class TempActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        //Fragment should not be added if activity was restored
        if (savedInstanceState == null) {
            StopwatchFragment stopwatch = new StopwatchFragment();
            //Beginning transaction
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.stopwatch_container, stopwatch); //Adding stopwatch to layout, and all transaction to back stack
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            //Approve the transaction
            ft.commit();
        }
    }
}