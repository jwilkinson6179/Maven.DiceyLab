import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinsTest {
    Bins testBin;

    @Before

    @After

    @Test
    public void AddResultTest()
    {
        // GIVEN
        Integer expectedThree = 4;
        Integer expectedSeven = 1;
        Bins testBin = new Bins(1, 6);

        // WHEN
        testBin.incrementBin(3);
        testBin.incrementBin(3);
        testBin.incrementBin(3);
        Integer actualSeven = testBin.incrementBin(5);
        Integer actualThree = testBin.incrementBin(3);

        // THEN

        assertEquals(expectedThree, actualThree);
        assertEquals(expectedSeven, actualSeven);
    }

    @Test
    public void getBinValEmpty()
    {
        // GIVEN
        Integer expected = 0;
        testBin = new Bins(1, 6);

        // WHEN

        testBin.getBin(1);
        Integer actual = 0;
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void getBinSevenTest()
    {
        // GIVEN

        Integer expected = 7;
        testBin = new Bins(1, 2);

        // WHEN

        testBin.incrementBin(2);
        testBin.incrementBin(1);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        Integer actual = testBin.getBin(2);

        // THEN

        assertEquals(expected, actual);
    }
}
