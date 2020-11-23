package com.example.transgeo.fragment.refleksi.thd_garis;

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

public class RefGarisA extends Fragment {

    public RefGarisA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ref_garis_a, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView ivGarisA = view.findViewById(R.id.iv_ref_garisa);
        WebView wvGarisA = view.findViewById(R.id.wv_ref_garisa);
        wvGarisA.getSettings().setJavaScriptEnabled(true);

        wvGarisA.loadUrl(GlobalVar.HTML_REF_BAYANGAN_SUATU_TITIK);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=1SUl_IviT1M6KGbR6n95l5FqbIe1m4ku0")
                .apply(new RequestOptions().fitCenter())
                .into(ivGarisA);

    }
}