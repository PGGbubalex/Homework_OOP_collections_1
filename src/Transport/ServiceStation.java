package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue <Car> queue = new LinkedList<>();

    private void addCar(Car car) {
        queue.offer(car);
    }

    public void addTruck(Trucks trucks) {
        addCar(trucks);
    }

    public void addPassenger(PassengerCars passengerCars) {
        addCar(passengerCars);
    }

    public void service() {
        if (!queue.isEmpty()) {
            Car car = queue.poll();
            if (car != null) {
                System.out.println(car + " на техобслуживании");
            }
        }
    }

}
