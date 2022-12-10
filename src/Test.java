import Data.Data;
import Driver.Driver_B;
import Driver.Driver_C;
import Driver.Driver_D;
import TransoptEnum.BodyType;
import TransoptEnum.CapacityType;
import TransoptEnum.LoadCapacity;
import Transport.PassengerCars;
import Transport.TheBuses;
import Transport.Trucks;

public class Test {
    public static void main(String[] args) {

        PassengerCars kamaz = new PassengerCars("Камаз", "65117", 11.8, BodyType.SEDAN);
        PassengerCars mercedes = new PassengerCars("Мерседес", "actros l", 15.6, BodyType.HATCHBACK);
        PassengerCars freightliner = new PassengerCars("Freightliner ", "Coronado", 14.0, BodyType.SUV);
        System.out.println(freightliner);
        freightliner.startMove();
        freightliner.finishMovement();
        freightliner.bestLapTime();
        freightliner.maxSpeed();
        freightliner.pitStop();
        Driver_B<PassengerCars> ivan = new Driver_B<PassengerCars>("Иванов Иван Иванович", "Б", 8);
        ivan.drive(freightliner);


        System.out.println("=======================================================");

        Trucks tesla = new Trucks("Tesla", "Truck", 0, LoadCapacity.N1);
        Trucks hyndai = new Trucks("Hyndai", "Santa Cruz", 4, LoadCapacity.N2);
        Trucks ford = new Trucks("Ford", "Maverick", 3.5, LoadCapacity.N3);
        System.out.println(ford);
        ford.startMove();
        ford.finishMovement();
        ford.bestLapTime();
        ford.maxSpeed();
        ford.pitStop();
        Driver_C<Trucks> petr = new Driver_C<Trucks>("Петров Петр Петрович", "С", 7);
        petr.drive(ford);

        System.out.println("=======================================================");

        TheBuses yutong = new TheBuses("Yutong", "U12", 0, CapacityType.EXTRA_LARGE);
        TheBuses vanHool = new TheBuses("Van Hool", "EX11", 5.7, CapacityType.ESPECIALLY_SMALL);
        TheBuses setra = new TheBuses("Setra", "S531 DT", 12.8, CapacityType.LARGE);
        System.out.println(setra);
        setra.startMove();
        setra.finishMovement();
        setra.maxSpeed();
        setra.bestLapTime();
        setra.pitStop();
        Driver_D<TheBuses> fedor = new Driver_D<TheBuses>("Федеров Федор Федорович", "Д",10);
        fedor.drive(setra);

        boolean success = Data.validate("login", "password", "password");
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }

        System.out.println("////////////////////////////////////////////////////");

        System.out.println("Новое задание");


    }
}
