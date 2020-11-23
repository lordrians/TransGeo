package com.example.transgeo.fragment.dilatasi.faktor_skala;

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

public class DilSkalaNegatif extends Fragment {
    public DilSkalaNegatif() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dil_skala_negatif, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = view.findViewById(R.id.iv_dil_skalanegatif);
        WebView webView = view.findViewById(R.id.wv_dil_skalanegatif);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(GlobalVar.HTML_DIL_SkalaNegatif);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=1IyREM7HwphZ6rEYzLOHn1qWieI3k-JH8")
                .apply(new RequestOptions().fitCenter())
                .into(imageView);
    }
}