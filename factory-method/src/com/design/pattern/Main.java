package com.design.pattern;

import com.design.pattern.example2.DecodedImage;
import com.design.pattern.example2.GifReader;
import com.design.pattern.example2.ImageReader;
import com.design.pattern.example2.JpegReader;

public class Main {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader imageReader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1);
        if (format.equals("gif")){
            imageReader = new GifReader(image);
        }
        if (format.equals("jpeg")){
            imageReader = new JpegReader(image);
        }
        assert imageReader != null;
        decodedImage = imageReader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
