package com.example.transgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME = 4000;

    Animation topAnm, botAnim;
    ImageView ivLogo;
    TextView tvLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        topAnm = AnimationUtils.loadAnimation(this,R.anim.top_animation_splash_screen);
        botAnim = AnimationUtils.loadAnimation(this,R.anim.bot_animation_splash_screen);

        ivLogo = findViewById(R.id.iv_logo_splash);
        tvLogo = findViewById(R.id.tv_logo_splash);

        ivLogo.setAnimation(topAnm);
        tvLogo.setAnimation(botAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIME);

    }
}
