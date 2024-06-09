public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
		this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return this.milesValue;
    }

    public static void main(String[] args) {
        // Testing the constructors and methods
        RewardValue reward1 = new RewardValue(100.0);
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        RewardValue reward2 = new RewardValue(10000);
        System.out.println("Cash Value: " + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }
}
