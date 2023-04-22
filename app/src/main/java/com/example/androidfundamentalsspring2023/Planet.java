package com.example.androidfundamentalsspring2023;

public class Planet {

    private final String name;
    private final String color;
    private final String urlImage;

    public Planet(String name, String color, String urlImage) {
        this.name = name;
        this.color = color;
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getUrlImage() {
        return urlImage;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
