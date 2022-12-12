package Transport;

import java.util.Objects;

public class Sponsor {

    private final String name;
    private final int amountOfSupport;

    public Sponsor(String name, int amountOfSupport) {
        this.name = ValidationUtill.validateString(name);
        this.amountOfSupport = ValidationUtill.validateNum(amountOfSupport);
    }

    private void sponsorASnack() {
        System.out.println(name + " спонсирует заед.");
    }

    public String getName() {
        return name;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amountOfSupport == sponsor.amountOfSupport && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfSupport);
    }

    @Override
    public String toString() {
        return "Transport.Sponsor{" +
                "name='" + name + '\'' +
                ", amountOfSupport=" + amountOfSupport +
                '}';
    }
}
