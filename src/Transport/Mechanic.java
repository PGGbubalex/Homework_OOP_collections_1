package Transport;

import java.util.Objects;

public class Mechanic <T extends Car> {

    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = ValidationUtill.validateString(name);
        this.surname = ValidationUtill.validateString(surname);
        this.company = ValidationUtill.validateString(company);
    }

    public boolean service(T t) {
        return t.service();
    }

    public void repair(T t) {
        t.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }

    @Override
    public String toString() {
        return "Transport.Mechanic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
