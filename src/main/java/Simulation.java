public class Simulation {
    Dice gameDice;
    Integer totalRolls;
    Bins results;

    Simulation(Integer numOfDies, Integer numberOfThrows)
    {
        gameDice = new Dice(numOfDies);
        totalRolls = numberOfThrows;
        results = new Bins(numOfDies, numOfDies * 6);
    }

    public void runSimulation()
    {
        for(Integer i = 0; i < totalRolls; i++)
        {
            results.incrementBin(gameDice.tossAndSum());
        }
    }

    public void printResults()
    {
        StringBuilder graph = new StringBuilder();

//        2 :    27917: 0.03 **

        for(Integer i = 2; i <= 12; i++)
        {
            Integer barWidth = results.getBin(i)/totalRolls;

//            String.format("%2s :%10.0f, %4.2f, %s", i, results.getBin(i), (results.getBin(i) / totalRolls), graphBar);
        }

    }
}
