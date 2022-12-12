package Driver;

import Transport.Car;
import Transport.PassengerCars;

public class Driver_B<B extends PassengerCars> extends Driver {

    public Driver_B(String fullName, String driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель " + getFullName() + " начинает движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель" + getFullName() + " заканчивает движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель " + getFullName() + " заправляет машину");
    }

    public void drive(PassengerCars passengerCars) {
        System.out.println("Водитель " + getFullName() + " на машине " + passengerCars.getBrand() + " " + passengerCars.getModel() + " начинает движение");
    }

}
