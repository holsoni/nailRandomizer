package com.example.nails.model;

import com.sun.imageio.plugins.jpeg.JPEG;
import javafx.scene.media.Media;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Locale;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manicure {
    private UUID id;
    private String form;
    private String color;
    private String design;
    private String photo;

   /* private createImage(String address){

    }*/

    public String getPhoto1(){
        return photo;
    }
}
