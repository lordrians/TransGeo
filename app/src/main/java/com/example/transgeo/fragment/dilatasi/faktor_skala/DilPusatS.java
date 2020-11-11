package com.example.transgeo.fragment.dilatasi.faktor_skala;

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

public class DilPusatS extends Fragment {

    public DilPusatS() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dil_pusat_s, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = view.findViewById(R.id.iv_dil_pusats);
        WebView webView = view.findViewById(R.id.wv_dil_pusats);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(GlobalVar.HTML_DIL_PusatS);
        Glide.with(getContext())
                .load("https://www.yuksinau.id/wp-content/uploads/2019/07/makalah-transformasi-geometri.jpg")
                .apply(new RequestOptions().centerCrop())
                .into(imageView);
    }
}