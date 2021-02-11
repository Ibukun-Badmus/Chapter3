package Chapter4;

import java.util.Scanner;

public class SalaryCalculatorDriver {
    public static void main(String[] args) {
        SalaryCalculator myCalculator = new SalaryCalculator();

        Scanner input = new Scanner(System.in);
        int counter = 0;

        while (counter < 3) {
            System.out.println("enter user name: ");
            myCalculator.setUser(input.nextLine());

            System.out.println("enter number of hourly rate");
            myCalculator.setHourlyRate(input.nextInt());

            System.out.println("enter number of hours worked");
            myCalculator.setHoursWorked(input.nextInt());
            input.nextLine();

            counter++;

            System.out.println();
            System.out.printf("userName: %s%n", myCalculator.getUser());
            System.out.printf( "hourlyRate: %d%n", myCalculator.getHourlyRate());
            System.out.printf("hoursWorked: %d%n", myCalculator.getHoursWorked());
            System.out.printf("grossPay: %f%n", myCalculator.grossPay());
            System.out.println();
        }


    }
}
