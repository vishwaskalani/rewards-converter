import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

	float MILES_TO_CASH_RATE = 0.0035f;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int expectedMilesValue = (int) (cashValue / MILES_TO_CASH_RATE);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCashValue = milesValue * MILES_TO_CASH_RATE;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
