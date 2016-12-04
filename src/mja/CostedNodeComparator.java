package mja;

import java.util.Comparator;

/**
 * Created by Mja on 11/28/2016.
 */
public class CostedNodeComparator implements Comparator<CostedNode>{

    @Override
    public int compare(CostedNode x, CostedNode y)
    {
        // Assume no Node is null. Real code should
        // probably be more robust
        // first priority is cost
        // if two costs were same, names will be compared

        int def = x.getCost() - y.getCost();
        if(def == 0)
        {
            return x.data.compareTo(y.data);
        }
        return def ;
    }
}
