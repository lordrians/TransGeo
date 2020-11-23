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

public class RefKordinatC extends Fragment {

    public RefKordinatC() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ref_kordinat_c, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.iv_ref_kordinatc);
        WebView webView = view.findViewById(R.id.wv_ref_kordinatc);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(GlobalVar.HTML_REF_THD_GARIS_XY);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=1A1emB0GFjT2HFF_bvEDwLSW3CYgnoIao")
                .apply(new RequestOptions().fitCenter())
                .into(imageView);

    }
}