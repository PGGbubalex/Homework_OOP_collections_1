package Driver;

import Transport.Trucks;

public class Driver_C <C extends Trucks> extends Driver {

    public Driver_C(String fullName, String driverLicense, int experience) {
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

    public void drive(Trucks trucks) {
        System.out.println("Водитель " + getFullName() + " на машине " + trucks.getBrand() + " " + trucks.getModel() + " начинает движение");
    }
}
