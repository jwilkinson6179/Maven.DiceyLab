import org.junit.Test;

public class SimulationTest {

    @Test
    public void MillionResult()
    {
        Simulation testSim = new Simulation(2, 1000000);
        testSim.runSimulation();
        testSim.printResults();

    }
}
