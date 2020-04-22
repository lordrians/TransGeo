package com.example.transgeo.fragment.refleksi;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SyaratRefleksiFragment extends Fragment {
    ImageView ivSyarat;
    TextView tvSyarat;

    public SyaratRefleksiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_syarat_refleksi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivSyarat = view.findViewById(R.id.iv_ref_syarat);
        tvSyarat = view.findViewById(R.id.tv_ref_syarat);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("myThing", 0);
        tvSyarat.setText(sharedPreferences.getString("sIsiRefleksi",""));
        Glide.with(getContext())
                .load(sharedPreferences.getString("sPhotoRefleksi",""))
                .apply(new RequestOptions().centerCrop())
                .into(ivSyarat);
    }
}
