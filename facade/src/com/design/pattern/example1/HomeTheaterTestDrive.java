package com.design.pattern.example1;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner");
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player");
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player");
        Projector projector = new Projector("Top-O-Line Projector");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, lights, screen, popper);
        homeTheater.watchMovie("TMMT");
        homeTheater.endMovie();
    }

}
