package Chapter3;

public class Employee {


    public double getYearlySalary;
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlySalary;
    private double tenPercentRaise;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        this.yearlySalary = yearlySalary;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0){
            this.monthlySalary = monthlySalary;
    }

}

    public double getMonthlySalary() {
        return monthlySalary;
    }


    public double getYearlySalary() {
        yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    public double getTenPercentRaise() {
    tenPercentRaise = monthlySalary * 0.1;
    return tenPercentRaise;
    }


    }

