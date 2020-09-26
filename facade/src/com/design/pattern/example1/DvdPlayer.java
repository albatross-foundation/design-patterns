package com.design.pattern.example1;

public class DvdPlayer {
    private String description;
    private String movie;
    private int currentTrack;

    public DvdPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void eject() {
        System.out.println(description + " eject");
    }

    public void play(String movie) {
        this.movie = movie;
        this.currentTrack = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void play(int currentTrack) {
        if (movie == null) {
            System.out.println(description + " cannot play track " + currentTrack + ", no dvd inserted");
        } else {
            this.currentTrack = currentTrack;
            System.out.println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
        }
    }

    public void stop() {
        this.currentTrack = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }

    @Override
    public String toString() {
        return description;
    }
}
