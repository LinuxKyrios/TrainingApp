package com.linuxkyrios.trainingapp;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WorkoutListFragment extends ListFragment {

    @Override
    public  View onCreateView(LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState) {
        //Using method onCreateView returns default ListFragment layout
        return super.onCreateView(inflater,
                container, savedInstanceState);
    }
}