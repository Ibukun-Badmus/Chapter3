package Chapter4;

import java.util.Scanner;

public class GasMileageDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage();

        //class variables
        double totalMilesPerGallon = 0;

        //prompts
        System.out.print("enter miles driven or -1 to exit program: ");
        gasMileage.setMilesDriven(scanner.nextInt());
        while (gasMileage.getMilesDriven() != -1) { //while sentinel loop
            System.out.print("enter gallons used: ");
            gasMileage.setGallonsUsed(scanner.nextInt());

            System.out.println("miles per gallon for this trip: "+ gasMileage.milesPerGallonCalculator());
            totalMilesPerGallon += gasMileage.milesPerGallonCalculator();

            System.out.println("*******************************");
            System.out.print("enter miles driven or -1 to exit program: ");
            gasMileage.setMilesDriven(scanner.nextInt());
        }
        System.out.println("total mpg: "+ totalMilesPerGallon);
    }
}
