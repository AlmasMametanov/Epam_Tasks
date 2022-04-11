package com.task1;

public class Car extends Vehicle {
    private int numSeats;
    private boolean isSuv;

    public Car(String brand, String model) {
        super(brand, model);
    }

    public Car(String brand, String model, int year, int price, int numSeats, boolean isSuv) {
        super(brand, model, year, price);

        this.numSeats = numSeats;
        this.isSuv = isSuv;
    }

    public int getNumSeats() {
        return this.numSeats;
    }

    public boolean getIsSuv() {
        return this.isSuv;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public void setIsSuv(boolean isSuv) {
        this.isSuv = isSuv;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of seats: " + this.numSeats + ", is SUV: " + this.isSuv;
    }
}
