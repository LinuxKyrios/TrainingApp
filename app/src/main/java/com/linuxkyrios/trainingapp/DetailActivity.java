package com.linuxkyrios.trainingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //This part of code returns reference to WorkoutDetailFragment
        WorkoutDetailFragment frag = (WorkoutDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(1);
    }
}