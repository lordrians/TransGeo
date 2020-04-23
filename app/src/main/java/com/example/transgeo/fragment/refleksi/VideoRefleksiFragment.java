package com.example.transgeo.fragment.refleksi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoRefleksiFragment extends Fragment implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerFragment playerView;
    public VideoRefleksiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video_refleksi, container, false);
        playerView = (YouTubePlayerFragment) getActivity().getFragmentManager().findFragmentById(R.id.video_refleksi);
        playerView.initialize(GlobalVar.YOUTUBE_API_KEY, this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }

//    @Override
//    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//        if (!b){
//            youTubePlayer.cueVideo("8oI0TVbXfpk");
//        }
//    }
//
//    @Override
//    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//        if (youTubeInitializationResult.isUserRecoverableError()){
//            youTubeInitializationResult.getErrorDialog(getActivity(), GlobalVar.RECOVERY_REQUEST).show();
//        } else {
//            String errMsg = String.format(getString(R.string.player_error), youTubeInitializationResult.toString());
//            Toast.makeText(getActivity(), errMsg, Toast.LENGTH_LONG).show();
//        }
//    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == GlobalVar.RECOVERY_REQUEST){
            getYoutubePlayerProvider().initialize(GlobalVar.YOUTUBE_API_KEY, this);
        }
    }

    protected YouTubePlayer.Provider getYoutubePlayerProvider() {
        return playerView;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b){
            youTubePlayer.cueVideo("8oI0TVbXfpk");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(getActivity(), GlobalVar.RECOVERY_REQUEST).show();
        } else {
            String err = String.format(getString(R.string.player_error), youTubeInitializationResult.toString());
            Toast.makeText(getActivity(), err, Toast.LENGTH_LONG).show();
        }
    }
}
