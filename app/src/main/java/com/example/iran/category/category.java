package com.example.iran.category;

public class category {
    private int image ;
    private String name;
    private int image_visible ;

    public category(int image, String name, int image_visible) {
        this.image = image;
        this.name = name;
        this.image_visible = image_visible;
    }

    public category(String name, int image_visible) {
        this.name = name;
        this.image_visible = image_visible;
    }

    public int getImage_visible() {
        return image_visible;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage_visible(int image_visible) {
        this.image_visible = image_visible;
    }
}
