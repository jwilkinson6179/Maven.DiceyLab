import java.util.HashMap;

public class Bins {
    HashMap<Integer, Integer> statResults;

    public Bins(Integer min, Integer max)
    {
        statResults = new HashMap<Integer, Integer>(max - min);
    }

    public Integer incrementBin(Integer dieResult)
    {
        if(statResults.containsKey(dieResult))
        {
            Integer newValue = statResults.get(dieResult) + 1;
            statResults.put(dieResult, newValue);
        }
        else
        {
            statResults.put(dieResult, 1);
        }
        return statResults.get(dieResult);
    }

    public Integer getBin(Integer dieResult)
    {
        if(statResults.containsKey(dieResult))
        {
            return statResults.get(dieResult);
        }
        else
        {
            return 0;
        }
    }
}
