package com.example.transgeo.fragment.translasi;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;

/**
 * A simple {@link Fragment} subclass.
 */
public class LangkahTranslasiFragment extends Fragment {
    private ImageView ivLangkah;
    private TextView tvLangkah;


    public LangkahTranslasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_langkah_translasi, container, false);
        ivLangkah = view.findViewById(R.id.iv_trans_langkah);
        tvLangkah = view.findViewById(R.id.tv_trans_langkah);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, 0);
        tvLangkah.setText(sharedPreferences.getString(GlobalVar.L_ISI_TRANS,""));
        Glide.with(getContext())
                .load(sharedPreferences.getString(GlobalVar.L_PHOTO_TRANS,""))
                .apply(new RequestOptions().centerCrop())
                .into(ivLangkah);
    }
}
