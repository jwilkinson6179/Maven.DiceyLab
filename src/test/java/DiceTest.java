import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DiceTest {
    Dice testDice;

    @Before

    @After

    @Test public void TossTest()
    {
        // GIVEN

        Integer expected = 2;
        testDice = new Dice(2, 6, (long)100);

        // WHEN

        Integer actual = testDice.toss();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void TossAndSumDiceTest()
    {
        // GIVEN

        Integer expected = 6;

        testDice = new Dice(2, 6, (long)5000);
        // WHEN

        Integer actual = testDice.tossAndSum();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void TossAndSumTwentyDiceTest()
    {
        // GIVEN

        Integer expected = 65;

        testDice = new Dice(20, 6, (long)54321);
        // WHEN
        Integer actual = testDice.tossAndSum();
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void TossAndSumFiveHundredDiceTest()
    {
        // GIVEN
        Double expected = 1750.0;
        testDice = new Dice(500);
        // WHEN
        Double actual = testDice.tossAndSum().doubleValue();
        // THEN

        assertEquals(expected, actual, 1250.0);
    }
}