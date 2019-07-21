package com.example.basicnavcom;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */

public class RecipientFragment extends Fragment {

    View view;
    Button Next;
    EditText editText;

    public RecipientFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_recipient, container, false);
        editText = view.findViewById(R.id.editText);

        Next  = view.findViewById(R.id.send);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections directions = RecipientFragmentDirections.actionRecipientFragmentToSpecifyAmountFragment(editText.getText().toString());
                Navigation.findNavController(view).navigate(directions);
            }
        });


        return view;
    }

}
