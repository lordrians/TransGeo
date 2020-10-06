package com.example.transgeo.fragment.rotasi.bid_kartesius;

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

public class Rotasi90 extends Fragment {
    public Rotasi90() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rotasi90, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.iv_rot_90);
        WebView webView = view.findViewById(R.id.wv_rot_90);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(GlobalVar.HTML_ROT_90);
        Glide.with(getContext())
                .load("https://www.yuksinau.id/wp-content/uploads/2019/07/makalah-transformasi-geometri.jpg")
                .apply(new RequestOptions().centerCrop())
                .into(imageView);

    }
}