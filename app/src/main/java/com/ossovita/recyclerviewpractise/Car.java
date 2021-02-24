package com.ossovita.recyclerviewpractise;

public class Car {
    private int logo;
    private String brand;
    private String model;



    public Car(int logo, String brand, String model) {
        this.logo = logo;
        this.brand = brand;
        this.model = model;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
