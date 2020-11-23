package com.example.transgeo.fragment.refleksi.bidang_kordinat;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;

public class RefKordinatA extends Fragment {


    public RefKordinatA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ref_kordinat_a, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView ivKordinatA = view.findViewById(R.id.iv_ref_kordinata);
        WebView wvKordinatA = view.findViewById(R.id.wv_ref_kordinata);
        wvKordinatA.getSettings().setJavaScriptEnabled(true);

        wvKordinatA.loadUrl(GlobalVar.HTML_REF_THDSUMBUKORDINAT);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=1e96yGezC7vcq3YzBfJv37Eb6GSxfJamL")
                .apply(new RequestOptions().fitCenter())
                .into(ivKordinatA);

    }
}