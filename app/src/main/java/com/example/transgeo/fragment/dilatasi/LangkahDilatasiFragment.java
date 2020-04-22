package com.example.transgeo.fragment.dilatasi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.transgeo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LangkahDilatasiFragment extends Fragment {

    public LangkahDilatasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_langkah_dilatasi, container, false);
    }
}
