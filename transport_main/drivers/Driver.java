package transport_main.drivers;

import transport_main.Validator;

import java.util.Objects;

public abstract class Driver {

    private final String name;
    private final boolean driverLicense;
    private final int drivingExperience;

    public Driver(String name, boolean driverLicense, int drivingExperience) {
        this.name = Validator.validateString(name);
        this.driverLicense = Validator.validateBoolean(driverLicense);
        this.drivingExperience = Validator.validateInteger(drivingExperience);
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", drivingExperience=" + drivingExperience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && drivingExperience == driver.drivingExperience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, drivingExperience);
    }
}