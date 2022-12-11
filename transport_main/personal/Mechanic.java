package transport_main.personal;

import transport_main.transport.Car;
import transport_main.transport.TransportType;

import java.util.Objects;

public class Mechanic<T extends Car> {
    private final String name;
    private final String company;
    private TransportType transportType;

    public Mechanic(String name, String company, TransportType transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public void maintenance(T car) {
        System.out.println(name + " Проводит техобслуживание " + car.getModel());
    }

    public void fixCar(T car) {
        System.out.println(name + " Чинит машину " + car.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company) && transportType == mechanic.transportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, transportType);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", transportType=" + transportType +
                '}';
    }
}
