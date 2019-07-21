package com.example.basicnavcom;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ConfirmationFragment extends Fragment {


    View view;
    TextView amount,name;

    public ConfirmationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_confirmation, container, false);
        amount = view.findViewById(R.id.amount);
        name = view.findViewById(R.id.name);

        name.setText("Name : "+ConfirmationFragmentArgs.fromBundle(getArguments()).getName());
        amount.setText("Amount : $"+ConfirmationFragmentArgs.fromBundle(getArguments()).getAmount());


        return view;
    }

}
