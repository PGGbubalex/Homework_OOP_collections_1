package Transport;

import TransoptEnum.CapacityType;

public class TheBuses extends Car implements Competing{

    private CapacityType capacityType;

    public TheBuses(String brand, String model, double engineCapacity, CapacityType capacityType) {
        super(brand, model, engineCapacity);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
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
        System.out.println("Автобус "+ getBrand()+" в диагностике не нуждается");
        return true;
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
