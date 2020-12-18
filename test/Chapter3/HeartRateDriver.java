package Chapter3;

import java.util.Scanner;

public class HeartRateDriver {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name");
        String firstName = input.nextLine();

        System.out.println("enter your last name");
        String LastName = input.nextLine();

        System.out.println("enter your day of Birth");
        int day = input.nextInt();

        System.out.println("enter your month of Birth");
        int month = input.nextInt();

        System.out.println("enter your year of Birth");
        int year = input.nextInt();

        HeartRates IbkHeartRate = new HeartRates(firstName, LastName, day, month, year );

        System.out.printf("Your first name is %s%n ",  IbkHeartRate.getfirstName());
        System.out.printf("Your last name is %s%n ",  IbkHeartRate.getLastName());
        System.out.printf("Your age is %d%n ",  IbkHeartRate.getAge(IbkHeartRate.getYear()));
        System.out.printf("Your maximum heart rate is %d%n ",  IbkHeartRate.getMaximumHeartRate(IbkHeartRate.getAge(IbkHeartRate.getYear())));
        System.out.printf("Your target heart rate is %.2f%n", IbkHeartRate.calculateTargetHeartRate(IbkHeartRate.getMaximumHeartRate(IbkHeartRate.getAge(IbkHeartRate.getYear()))));






    }




}
