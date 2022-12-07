package transport_main.drivers;

import transport_main.Validator;

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
}