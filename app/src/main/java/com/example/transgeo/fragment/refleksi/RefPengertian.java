package com.example.transgeo.fragment.refleksi;

import android.annotation.SuppressLint;
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
import com.squareup.picasso.Picasso;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.activity.RefleksiActivity;
import com.example.transgeo.object.GlobalVar;
import com.github.chrisbanes.photoview.PhotoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RefPengertian extends Fragment {
    private PhotoView ivPengertian;

    public RefPengertian() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengertian_refleksi, container, false);

    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivPengertian = (PhotoView) view.findViewById(R.id.iv_ref_pengertian);

        WebView webView = view.findViewById(R.id.wv_ref_pengertian);
        webView.loadUrl(GlobalVar.HTML_REF_PENGERTIAN);
        webView.getSettings().setJavaScriptEnabled(true);

        Glide.with(getContext())
                .load("https://drive.google.com/uc?id=18so2SQXNae2BEL9nW19QCyNjwWRIdQPr")
                .apply(new RequestOptions().fitCenter())
                .into(ivPengertian);



    }
}
