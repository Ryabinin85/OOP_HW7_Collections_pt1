package transport_main.serviceStation;

import transport_main.transport.Car;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    static Queue<Car> serviceStation = new LinkedList<>();

    public static void addCarToQueue(Car car) {
        serviceStation.offer(car);
        System.out.println(car + "добавлена в очередь");
    }

    public static void maintenance() {
        serviceStation.poll();
        System.out.println("Машина прошла техобслуживание");

    }
}
