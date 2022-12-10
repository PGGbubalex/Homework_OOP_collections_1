package Driver;

import Transport.Car;
import Transport.Competing;
import Transport.ValidationUtill;

import java.util.Objects;

public abstract class Driver <B extends Car & Competing> {

    private String fullName;
    private String driverLicense;
    private int experience;

    public Driver(String fullName, String driverLicense, int experience) {

        this.fullName = ValidationUtill.validateString(fullName);
        this.driverLicense = ValidationUtill.validateString(driverLicense);
        this.experience = experience;

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = ValidationUtill.validateString(fullName);
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = ValidationUtill.validateString(driverLicense);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuelCar();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(driverLicense, driver.driverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", experience=" + experience +
                '}';
    }

}
