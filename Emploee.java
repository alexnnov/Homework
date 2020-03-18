import java.util.Objects;

public class Emploee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Emploee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emploee)) return false;
        Emploee emploee = (Emploee) o;
        return getId() == emploee.getId() &&
                getSalary() == emploee.getSalary() &&
                getFirstName().equals(emploee.getFirstName()) &&
                getLastName().equals(emploee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getSalary());
    }
}
