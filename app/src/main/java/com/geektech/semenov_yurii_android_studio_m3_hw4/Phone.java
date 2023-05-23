package com.geektech.semenov_yurii_android_studio_m3_hw4;

import java.io.Serializable;

public class Phone implements Serializable {

    private int image;
    private String title;
    private String description;
    private String price;
    private String color;

    public Phone(int image, String title, String description, String price, String color) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
