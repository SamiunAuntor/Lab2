import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RideFareCalculatorTest {

    private final RideFareCalculator calculator = new RideFareCalculator();

    @Test
    public void testEconomyRideWithoutEarlyArrival() {
        double fare = calculator.calculateFare("Economy", 10, 5, false);
        assertEquals(18.75, fare, 0.01);
    }

    @Test
    public void testEconomyRideWithEarlyArrival() {
        double fare = calculator.calculateFare("Economy", 10, 5, true);
        assertEquals(16.88, fare, 0.01);
    }

    @Test
    public void testPremiumRideWithoutEarlyArrival() {
        double fare = calculator.calculateFare("Premium", 10, 5, false);
        assertEquals(30.00, fare, 0.01);
    }

    @Test
    public void testPremiumRideWithEarlyArrival() {
        double fare = calculator.calculateFare("Premium", 10, 5, true);
        assertEquals(27.00, fare, 0.01);
    }

    @Test
    public void testInvalidRideType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFare("Luxury", 10, 5, false);
        });
        assertEquals("Invalid ride type. Please enter 'Economy' or 'Premium'.", exception.getMessage());
    }
}
