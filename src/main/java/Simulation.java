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
        Integer graphBarUnit = totalRolls / 100;

        for(Integer i = 2; i <= 12; i++)
        {
            StringBuilder bar = new StringBuilder();
            Integer barWidth = results.getBin(i) / graphBarUnit;

            for(int k = 1; k <= barWidth; k++)
            {
                bar.append("*");
            }

            Float percentage = (float)results.getBin(i) / (float) totalRolls;
            String line = String.format("%2d :%10d: %4.2f %s\n", i, results.getBin(i),
                    percentage, bar);
            graph.append(line);
        }
        System.out.println(graph.toString());
    }
}
