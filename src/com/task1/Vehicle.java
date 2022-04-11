package com.task1;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private int price;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, String model, int year, int price) {
        this(brand, model);

        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public int getPrice() {
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Brand: " + this.brand + ", model: " + this.model + ", year: " + this.year + ", price: " + this.price;
    }
}
