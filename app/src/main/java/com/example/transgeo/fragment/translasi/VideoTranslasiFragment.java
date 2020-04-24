package com.example.transgeo.fragment.translasi;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoTranslasiFragment extends Fragment implements YouTubePlayer.OnInitializedListener {
    private YouTubePlayerFragment playerView;
    private static View view;

    public VideoTranslasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view != null){
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null){
                parent.removeView(view);
            }
        }
        try {
            view = inflater.inflate(R.layout.fragment_video_translasi, container, false);
        } catch (InflateException e){
        }

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        playerView = (YouTubePlayerFragment) getActivity().getFragmentManager().findFragmentById(R.id.video_translasi);
        playerView.initialize(GlobalVar.YOUTUBE_API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b){
            SharedPreferences sharedPreferences = getContext().getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, 0);
            String idVidio = sharedPreferences.getString(GlobalVar.ID_VIDEO_TRANS,"");
            youTubePlayer.cueVideo(idVidio);
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
