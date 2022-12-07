package transport_main.personal;

import transport_main.transport.Car;

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
}
