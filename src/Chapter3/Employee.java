package Chapter3;

public class Employee {

    private double yearlySalary;
    private double monthlySalary;
    private  String lastName;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public static void main(String[] args) {

    }
    private String firstName;

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double yearlySalary() {
        yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setMonthlySalary(int Amount) {
        if(Amount > 0) {
            monthlySalary = Amount;
        }
    }
}
