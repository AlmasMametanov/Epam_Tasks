package com.task1;

public class Taxi extends Car {
    private int taxiId;
    private double fare;
    private boolean isStickerOnCar;

    public Taxi(String brand, String model, int taxiId, double fare, boolean isStickerOnCar) {
        super(brand, model);

        this.taxiId = taxiId;
        this.fare = fare;
        this.isStickerOnCar = isStickerOnCar;
    }

    public int getTaxiId() {
        return this.taxiId;
    }

    public double getFare() {
        return this.fare;
    }

    public boolean getStickerOnCar() {
        return this.isStickerOnCar;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setStickerOnCar(boolean isStickerOnCar) {
        this.isStickerOnCar = isStickerOnCar;
    }

    @Override
    public String toString() {
        return "Taxi: " + this.taxiId + " " + this.getBrand() + " " + this.getModel() + " " +
                this.fare + " " + this.isStickerOnCar;
    }
}
