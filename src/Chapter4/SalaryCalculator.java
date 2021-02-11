package Chapter4;

public class SalaryCalculator {


    private String userName;
    private int hourlyRate;
    private int hoursWorked;


    public SalaryCalculator(String userName, int hourlyRate, int hoursWorked){
        this.userName = userName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public SalaryCalculator() {

    }

    public void setUser(String name) {
        this.userName = name;
    }

    public String getUser() {
        return userName;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double grossPay() {
        if(hoursWorked > 40){
            int overtime = hoursWorked - 40;
            return  40 * 1.5 * overtime;
        }
        return hoursWorked * hourlyRate;
    }
}
