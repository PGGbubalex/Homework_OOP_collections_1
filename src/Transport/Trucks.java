package Transport;

import TransoptEnum.LoadCapacity;

public class Trucks extends Car implements Competing{

    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineCapacity, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);

        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void startMove() {
        System.out.println(getBrand() + " начинает движение.");

    }

    @Override
    public void finishMovement() {
        System.out.println(getBrand() + " заканчивает движение.");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина починена");
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s заехал на пит-стоп\n", getBrand(), getModel());
        System.out.printf("%s %s выехал с пит-стопа\n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время %s %s - %.2f\n", getBrand(), getModel(), (1 + Math.random()));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость %s %s - %.2f\n", getBrand(),getModel(), (100 + Math.random() * 200));
    }

}
