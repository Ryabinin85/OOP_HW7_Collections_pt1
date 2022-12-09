package transport_main.transport;

import transport_main.Validator;

public abstract class Transport {
    private final String brand;
    private final String model;
    private int year;
    private String country;
    private String colour;
    private double maxSpeed;

    public Transport(String brand, String model, int year, String country, String colour, double maxSpeed) {
        this.brand = Validator.validateString(brand);
        this.model = Validator.validateString(model);
        this.colour = Validator.validateString(colour);
        this.country = Validator.validateString(country);
        this.year = validateYear(year);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public Transport(String brand, String model) {
        this.brand = Validator.validateString(brand);
        this.model = Validator.validateString(model);
    }

    abstract void refill();
    abstract void printType();
    private int validateYear(int year) {
        if (year <= 0)
            return this.year = 2000;
        else
            return this.year = year;
    }

    private double validateMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 50)
            return this.maxSpeed = 50;
        else
            return this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColour(String colour) {
        this.colour = Validator.validateString(colour);
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }
}