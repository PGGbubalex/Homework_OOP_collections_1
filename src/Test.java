import Data.Data;
import Driver.Driver;
import Driver.Driver_B;
import Driver.Driver_C;
import Driver.Driver_D;
import TransoptEnum.BodyType;
import TransoptEnum.CapacityType;
import TransoptEnum.LoadCapacity;
import Transport.*;
import Transport.Car;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Sponsor sponsor1 = new Sponsor("Спонсор 1", 2000000);
        Sponsor sponsor2 = new Sponsor("Спонсор 2", 1800000);
        Sponsor sponsor3 = new Sponsor("Спонсор 3", 3400000);

        Mechanic mechanic1 = new Mechanic<PassengerCars>("Петр", "Васильев", "Компания 1");
        Mechanic mechanic2 = new Mechanic<PassengerCars>("Иван", "Васильев", "Компания 2");
        Mechanic mechanic4 = new Mechanic<Trucks>("Андрей", "Васильев", "Компания 1");
        Mechanic mechanic5 = new Mechanic<Trucks>("Сергей", "Васильев", "Компания 3");
        Mechanic mechanic6 = new Mechanic<TheBuses>("Виктор", "Васильев", "Компания 3");



        PassengerCars kamaz = new PassengerCars("Камаз", "65117", 11.8, BodyType.SEDAN);
        kamaz.addDriver(new Driver_B<>("Иванов Иван Иванович", "Б", 8));
        kamaz.addSponsor(sponsor1, sponsor2);
        kamaz.addMechanic(mechanic1, mechanic2);

        PassengerCars mercedes = new PassengerCars("Мерседес", "actros l", 15.6, BodyType.HATCHBACK);
        mercedes.addDriver(new Driver_B<>("Максимова Светлана Игоревна", "Б", 13));
        mercedes.addSponsor(sponsor3);
        mercedes.addMechanic(mechanic2);

        PassengerCars freightliner = new PassengerCars("Freightliner ", "Coronado", 14.0, BodyType.SUV);
        freightliner.addDriver(new Driver_B<>("Хейфец Виктор Лазаревич", "Б", 1));
        freightliner.addSponsor(sponsor1);
        freightliner.addMechanic(mechanic1);

        System.out.println("=======================================================");

        Trucks tesla = new Trucks("Tesla", "Truck", 0, LoadCapacity.N1);
        tesla.addDriver(new Driver_C<>("Петров Петр Петрович", "С", 7));
        tesla.addMechanic(mechanic4);
        tesla.addSponsor(sponsor2,sponsor3);

//        Trucks hyndai = new Trucks("Hyndai", "Santa Cruz", 4, LoadCapacity.N2);
//        hyndai.addDriver(new Driver_C<>("Богданова Дарья Сергеевна", "C", 10));
//
//        Trucks ford = new Trucks("Ford", "Maverick", 3.5, LoadCapacity.N3);
//        ford.addDriver(new Driver_C<>("Жуков Олег Григорьевич", "С", 8));


        System.out.println("=======================================================");

        TheBuses yutong = new TheBuses("Yutong", "U12", 0, CapacityType.EXTRA_LARGE);
        yutong.addDriver(new Driver_D<>("Федеров Федор Федорович", "Д",10));
        yutong.addMechanic(mechanic5,mechanic6);
        yutong.addSponsor(sponsor1,sponsor2,sponsor3);

//        TheBuses vanHool = new TheBuses("Van Hool", "EX11", 5.7, CapacityType.ESPECIALLY_SMALL);
//        vanHool.addDriver(new Driver_D<>("Иванов Евгений Алексеевич", "Д", 8));
//
//        TheBuses setra = new TheBuses("Setra", "S531 DT", 12.8, CapacityType.LARGE);
//        setra.addDriver(new Driver_D<>("Григорьев Игорь Андреевич", "Д", 11));



        System.out.println("////////////////////////////////////////////////////");

        List<Car> cars = List.of(
                kamaz, mercedes, freightliner,
                tesla,
                yutong
        );
        for (Car car : cars) {
            carInfo(car);
        }

        System.out.println("=====================================");

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassenger(kamaz);
        serviceStation.addTruck(tesla);
        serviceStation.service();
        serviceStation.service();

    }

    private static void carInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + car.getModel());
        System.out.println("Водитель: " + car.getDrivers());
        System.out.println("Cпонсоры: " + car.getSponsors());
        System.out.println("Механики: " + car.getMechanics());
    }


}
