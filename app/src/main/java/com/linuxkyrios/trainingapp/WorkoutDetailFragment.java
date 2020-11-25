package com.linuxkyrios.trainingapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WorkoutDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Informing system, that this fragment uses layout placed in fragment_workout_detail
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
}