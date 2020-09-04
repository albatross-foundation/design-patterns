package com.design.pattern.example2;

public class GifReader implements ImageReader {

    private DecodedImage decodedImage;

    public GifReader(String imageName) {
        this.decodedImage = new DecodedImage(imageName);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
