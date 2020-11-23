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

public class RefGarisC extends Fragment {

    public RefGarisC() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ref_garis_c, container, false);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView ivGarisC = view.findViewById(R.id.iv_ref_garisc);
        WebView wvGarisC = view.findViewById(R.id.wv_ref_garisc);
        wvGarisC.getSettings().setJavaScriptEnabled(true);

        wvGarisC.loadUrl(GlobalVar.HTML_REF_BAYANGAN_SUATU_BANGUN);
        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=1uc8UDIiIU5Gx2bycgmkpfSOYuahSWUrf")
                .apply(new RequestOptions().fitCenter())
                .into(ivGarisC);

    }
}