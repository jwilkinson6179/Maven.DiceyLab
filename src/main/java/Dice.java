import java.util.Random;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Dice {

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());
    Integer totalDice;
    Integer sides;
    Random randomizer;

    public Dice()
    {
        totalDice = 1;
        sides = 6;
        randomizer = new Random();
    }

    public Dice(Integer numberOfDice)
    {
        totalDice = numberOfDice;
        sides = 6;
        randomizer = new Random();
    }

    public Dice(Integer numberOfDice, Integer sidesPerDie)
    {
        totalDice = numberOfDice;
        sides = sidesPerDie;
        randomizer = new Random();
    }

    protected Dice(Integer numberOfDice, Integer sidesPerDie, Long seed)
    {
        totalDice = numberOfDice;
        sides = sidesPerDie;
        randomizer = new Random(seed);
    }

    public  Integer toss()
    {
        Integer roll = randomizer.nextInt(sides) + 1;
//        LOGGER.log(INFO, "Rolled " + roll + " on 1d" + sides);

        return roll;
    }

    public Integer tossAndSum()
    {
        Integer sum = 0;

        for(Integer die = 0; die < totalDice; die++)
        {
            Integer roll = toss();
            sum += roll;
        }
//        LOGGER.log(INFO, "Result is " + sum + " of " + totalDice + "d" + sides);
        return sum;
    }
}
