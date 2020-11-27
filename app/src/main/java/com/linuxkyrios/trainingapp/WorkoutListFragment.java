package com.linuxkyrios.trainingapp;

import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ListView;


public class WorkoutListFragment extends ListFragment {

    //Creating interface of listener object and the object itself
    static interface Listener {
        void itemClicked(long id);
    };

    private Listener listener;

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
        //sending adapter to list view
        setListAdapter(adapter);

        //Using method onCreateView returns default ListFragment layout
        return super.onCreateView(inflater,
                container, savedInstanceState);
    }

    @Override
    //This method is attached when fragment is attached to activity
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }

    @Override
    //This method is sending information to listener if any element on ListView is clicked
    public void onListItemClick(ListView ListView,
                                View itemView,
                                int position,
                                long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}