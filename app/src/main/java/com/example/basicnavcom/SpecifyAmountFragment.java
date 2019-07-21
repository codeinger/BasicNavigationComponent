package com.example.basicnavcom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


public class SpecifyAmountFragment extends Fragment {

    View view;
    Button Send;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_specify_amount, container, false);
        // Inflate the layout for this fragment

        Send = view.findViewById(R.id.send);
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_specifyAmountFragment_to_confirmationFragment2);
            }
        });

        return view;
    }

    
}
