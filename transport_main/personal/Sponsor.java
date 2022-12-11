package transport_main.personal;

import transport_main.transport.Car;

import java.util.Objects;

public class Sponsor<T extends Car> {
    private String company;
    private double support;

    public Sponsor(String company, double support) {
        this.company = company;
        this.support = support;
    }

    public String getCompany() {
        return company;
    }

    public void sponsor(T car) {
        System.out.println(company + " Спонсирует " + car.getBrand() + " на сумму " + support);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return Double.compare(sponsor.support, support) == 0 && Objects.equals(company, sponsor.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, support);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "company='" + company + '\'' +
                ", support=" + support +
                '}';
    }
}
