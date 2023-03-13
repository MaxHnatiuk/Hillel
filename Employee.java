package OOP;

public class Employee {
    private String lastName;
    private String firstName;
    private String position;
    private double hourlyWages;

    public Employee(String lastName, String firstName, String position, double hourlyWages) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.hourlyWages = hourlyWages;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPosition() {
        return position;
    }
    public double getHourlyWages() {
        return hourlyWages;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyWages = hourlyRate;
    }
    public String toString() {
        return "Employee [lastName=" + lastName + ", firstName=" + firstName + ", position=" + position +
                ", hourlyRate=" + hourlyWages + "]";
    }
}

