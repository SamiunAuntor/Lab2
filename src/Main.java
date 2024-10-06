import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RideFareCalculator calculator = new RideFareCalculator();

        System.out.print("Enter ride type (Economy/Premium): ");
        String rideType = scanner.nextLine();

        System.out.print("Enter travel time (minutes): ");
        int minutes = scanner.nextInt();

        System.out.print("Enter distance (miles): ");
        int miles = scanner.nextInt();

        System.out.print("Was the ride completed 10 minutes earlier than estimated? (true/false): ");
        boolean earlyArrival = scanner.nextBoolean();

        int fareInCents = calculator.calculateFare(rideType, minutes, miles, earlyArrival);
        double fareInDollars = fareInCents / 100.0;

        System.out.println("Total fare: $" + String.format("%.2f", fareInDollars));

        scanner.close();
    }
}
