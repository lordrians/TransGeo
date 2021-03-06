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

public class RefGarisB extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ref_garis_b, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView wvRefGarisB = view.findViewById(R.id.wv_ref_garisb);
        ImageView ivRefGarisB = view.findViewById(R.id.iv_ref_garisb);
        wvRefGarisB.getSettings().setJavaScriptEnabled(true);

        wvRefGarisB.loadUrl(GlobalVar.HTML_REF_BAYANGAN_SUATU_GARIS);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=17K06kZxRwiU1DdJVAGZafgx4DCcWLk6e")
                .apply(new RequestOptions().fitCenter())
                .into(ivRefGarisB);

    }
}