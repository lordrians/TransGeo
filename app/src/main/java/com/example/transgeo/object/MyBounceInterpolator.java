package com.example.transgeo.object;

import android.view.animation.Interpolator;

public class MyBounceInterpolator implements Interpolator {
    private double mAmplitude = 1;
    private double mFrequency = 10;

    public MyBounceInterpolator(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    @Override
    public float getInterpolation(float v) {
        return (float) (-1 * Math.pow(Math.E, -v/ mAmplitude) *
                Math.cos(mFrequency * v) + 1);
    }
}
