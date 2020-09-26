package com.design.pattern.example1;

public class Amplifier {
    private String description;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println(description + " setting tuner to" + dvdPlayer);
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println(description + " setting dvd to " + dvdPlayer);
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println(description + " setting CD player to " + cdPlayer);
    }

    @Override
    public String toString() {
        return description;
    }
}
