package com.example.fragmentdata29072019;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment{

    View view;
    EditText edtAndroid;
    Button btnAndroid;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_android, container, false);
        edtAndroid = view.findViewById(R.id.edittextAndroid);
        btnAndroid = view.findViewById(R.id.buttonAndroid);
        ((MainActivity)getActivity()).onListenDataSeekbar(new ListenDataSeekbar() {
            @Override
            public void onChange(int progress) {
                Log.d("BBB",progress + "");
            }
        });
        return view;
    }


}

