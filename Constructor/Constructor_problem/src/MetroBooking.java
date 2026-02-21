/*   Metro Ticket Booking – Use constructor overloading for different booking scenarios, this() for chaining, and
calculate fare based on seat class, round-trip, and discount codes.

Key Features in this Code

Constructor Overloading

Multiple constructors allow booking with minimal info or full options.

Constructor Chaining with this()

All constructors eventually call the full constructor with all parameters.

Fare Calculation

Base fare depends on seat class.

Round-trip doubles the fare.

Discounts are applied as percentages.

Scalable

You can easily add more seat classes, additional fees, or promo codes.
 */
class MetroTicket {
    private String passengerName;
    private String seatClass; // "Regular", "Premium"
    private boolean roundTrip;
    private double fare;
    private double discount; // in percentage

    // Base fare for different classes
    private final double REGULAR_FARE = 100;
    private final double PREMIUM_FARE = 150;

    // Constructor 1: Only name, default seat class and single trip
    MetroTicket(String passengerName) {
        this(passengerName, "Regular", false, 0); // chaining to main constructor
    }

    // Constructor 2: Name and seat class
    MetroTicket(String passengerName, String seatClass) {
        this(passengerName, seatClass, false, 0); // default single trip, no discount
    }

    // Constructor 3: Name, seat class, round trip
    MetroTicket(String passengerName, String seatClass, boolean roundTrip) {
        this(passengerName, seatClass, roundTrip, 0); // no discount
    }

    // Constructor 4: Full constructor with discount
    MetroTicket(String passengerName, String seatClass, boolean roundTrip, double discount) {
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.roundTrip = roundTrip;
        this.discount = discount;
        calculateFare(); // calculate fare automatically
    }

    // Method to calculate fare
    private void calculateFare() {
        if (seatClass.equalsIgnoreCase("Regular")) {
            fare = REGULAR_FARE;
        } else if (seatClass.equalsIgnoreCase("Premium")) {
            fare = PREMIUM_FARE;
        } else {
            System.out.println("Invalid seat class. Defaulting to Regular.");
            fare = REGULAR_FARE;
        }

        // Round-trip doubles the fare
        if (roundTrip) {
            fare *= 2;
        }

        // Apply discount
        if (discount > 0 && discount <= 100) {
            fare -= (fare * discount / 100);
        }
    }

    // Display ticket information
    void displayTicket() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Round Trip: " + (roundTrip ? "Yes" : "No"));
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Fare: $" + fare);
        System.out.println("-------------------------");
    }
}

public class MetroBooking {
    public static void main(String[] args) {
        // Booking using different constructors
        MetroTicket ticket1 = new MetroTicket("Alice");
        MetroTicket ticket2 = new MetroTicket("Bob", "Premium");
        MetroTicket ticket3 = new MetroTicket("Charlie", "Regular", true);
        MetroTicket ticket4 = new MetroTicket("David", "Premium", true, 10);

        // Display tickets
        ticket1.displayTicket();
        ticket2.displayTicket();
        ticket3.displayTicket();
        ticket4.displayTicket();
    }
}