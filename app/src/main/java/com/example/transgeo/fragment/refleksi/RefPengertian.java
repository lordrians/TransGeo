package com.example.transgeo.fragment.refleksi;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.activity.RefleksiActivity;
import com.example.transgeo.object.GlobalVar;


/**
 * A simple {@link Fragment} subclass.
 */
public class RefPengertian extends Fragment {
    private ImageView ivPengertian;

    public RefPengertian() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengertian_refleksi, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivPengertian = view.findViewById(R.id.iv_ref_pengertian);

        WebView webView = view.findViewById(R.id.wv_ref_pengertian);
        webView.loadUrl("file:///android_asset/REF_Pengertian.html");

        Glide.with(getContext())
                .load("https://www.yuksinau.id/wp-content/uploads/2019/07/makalah-transformasi-geometri.jpg")
                .apply(new RequestOptions().centerCrop())
                .into(ivPengertian);



    }
}
