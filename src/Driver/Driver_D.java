package Driver;

import Transport.TheBuses;

public class Driver_D <D extends TheBuses> extends Driver{

    public Driver_D(String fullName, String driverLicense, int experience) {
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

    public void drive(TheBuses theBuses) {
        System.out.println("Водитель " + getFullName() + " на машине " + theBuses.getBrand() + " " + theBuses.getModel() + " начинает движение");
    }
}
