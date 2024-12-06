package com.example.autorent;

public class Car {

    private String name;
    private String price;
    private String location;
    private int imageResource;

    public Car(String name, String price, String location, int imageResource) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.imageResource = imageResource;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public String getLocation() { return location; }
    public int getImageResource() { return imageResource; }
}
