package com.linuxkyrios.trainingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        // Uploading reference to FrameLayout, which contains reference to WorkoutDetailFragment;
        // This layout will be started only if app is started on big screen device.
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            // Beginning of fragment transaction
            WorkoutDetailFragment details = new WorkoutDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkout(id);
            // Replacing fragment
            ft.replace(R.id.fragment_container, details);
            // Setting animation for fading and opening new fragment
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            // Adding transaction to back stack
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);
        }
    }
}