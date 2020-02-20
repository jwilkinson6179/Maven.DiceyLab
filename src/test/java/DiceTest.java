import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
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
    @Parameters({
            "2, 6, 40, 7",
            "2, 6, 40, 7",
            "2, 6, 40, 7",
            "6, 6, 500, 21",
            "10, 6, 20, 42",
            "4, 6, 6666, 13" })
    public void TossAndSumTest(Integer number, Integer sides, long seed, Integer result) throws Exception
    {
        assertThat(new Dice(number, sides, seed).tossAndSum(), is(result));
    }


}