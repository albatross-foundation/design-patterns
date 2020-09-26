package com.design.pattern.example1;

public class CdPlayer {
    private String description;
    private String title;
    private int currentTrack;

    public CdPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void play(String title) {
        this.title = title;
        this.currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    public void eject() {
        System.out.println(description + " eject");
    }

    public void play(int currentTrack) {
        if (title == null) {
            System.out.println(description + "cannot play track " + currentTrack + ", no CD inserted");
        } else {
            this.currentTrack = currentTrack;
            System.out.println(description + "playing track " + currentTrack);
        }
    }

    public void stop() {
        this.currentTrack = 0;
        System.out.println(description + " stopped");
    }

    public void pause() {
        System.out.println(description + " paused");
    }
}
