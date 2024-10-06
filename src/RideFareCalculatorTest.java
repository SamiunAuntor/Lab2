class RideFareCalculator {

    public int calculateFare(String rideType, int minutes, int miles, boolean earlyArrival) {
        int baseFare = 500;
        int timeCharge = 50 * minutes;
        int distanceCharge = 0;

        if (rideType.equalsIgnoreCase("Economy")) {
            distanceCharge = 175 * miles;
        } else if (rideType.equalsIgnoreCase("Premium")) {
            distanceCharge = 300 * miles;
            distanceCharge += distanceCharge * 20 / 100;
        } else {
            throw new IllegalArgumentException("Invalid ride type. Please enter 'Economy' or 'Premium'.");
        }

        int totalFare = baseFare + timeCharge + distanceCharge;

        if (earlyArrival) {
            totalFare -= totalFare * 10 / 100;
        }

        return totalFare;
    }
}
