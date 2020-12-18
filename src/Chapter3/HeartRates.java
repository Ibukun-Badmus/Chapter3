package Chapter3;

import java.util.Calendar;


public class HeartRates {
        private String firstName;
        private String lastName;
        private int day;
        private int month;
        private int year;

    public HeartRates(String firstName, String lastName, int day, int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getfirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getAge( int year) {
        int age = 0;
//        int currentYear = 2020;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        age = currentYear - year;

        return age;
    }

    public int getMaximumHeartRate(int age) {
        int maximumHeartRates = 220 - age;
        return maximumHeartRates;

    }

    public double calculateTargetHeartRate(int maximumHeartRates) {
      double fiftyPercent = 0.5;
      double targetHeartRate = 0.5 * maximumHeartRates;

        return targetHeartRate;

    }

}
