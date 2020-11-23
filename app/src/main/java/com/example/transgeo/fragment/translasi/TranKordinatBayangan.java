package com.example.transgeo.fragment.translasi;

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

public class TranKordinatBayangan extends Fragment {

    public TranKordinatBayangan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tran_kordinat_bayangan, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.iv_tra_kordinatbayangan);
        WebView webView = view.findViewById(R.id.wv_tra_kordinatbayangan);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(GlobalVar.HTML_TRA_KordinatBayangan);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=1rHctBL3XSMjcO7f4amSX-NA7_eb8x7lP")
                .apply(new RequestOptions().fitCenter())
                .into(imageView);

    }
}