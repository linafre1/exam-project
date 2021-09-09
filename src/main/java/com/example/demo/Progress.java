package com.example.demo;

public class Progress {
    private int levels;
    private float progress;

    public Progress(int levels, int progress) {
        this.levels = levels;
        this.progress = progress;
    }

    public Progress() {
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }
}
