package com.linuxkyrios.trainingapp;

import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class WorkoutListFragment extends ListFragment {

    @Override
    public  View onCreateView(LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState) {

        String[] names = new String[Workout.workouts.length];
        //Creating array with training names
        for (int i = 0; i <names.length; i++) {
            names[i] = Workout.workouts[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                //Uploading context from LayoutInflater object
                inflater.getContext(), android.R.layout.simple_list_item_1,
                names);
        setListAdapter(adapter);

        //Using method onCreateView returns default ListFragment layout
        return super.onCreateView(inflater,
                container, savedInstanceState);
    }
}