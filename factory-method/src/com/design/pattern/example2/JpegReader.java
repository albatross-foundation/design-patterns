package com.design.pattern.example2;

public class JpegReader implements ImageReader {

    private DecodedImage decodedImage;

    public JpegReader(String imageName){
        this.decodedImage = new DecodedImage(imageName);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
