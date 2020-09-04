package com.design.pattern.example2;

public class DecodedImage {
    private String imageName;

    public DecodedImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return imageName + " is decoded!";
    }
}
