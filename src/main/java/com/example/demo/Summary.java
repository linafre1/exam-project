package com.example.demo;

public class Summary {
    private int activity;
    private Duration duration;
    private float distance;

    public Summary(int activity, Duration duration, float distance) {
        this.activity = activity;
        this.duration = duration;
        this.distance = distance;
    }

    public Summary () {
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}
