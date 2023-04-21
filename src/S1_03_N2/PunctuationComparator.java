package S1_03_N2;

import java.util.Comparator;

public class PunctuationComparator implements Comparator<Restaurant> {
    @Override
    //NO LA USO!!
    public int compare(Restaurant o1, Restaurant o2) {
        return  o2.getPunctuation() - o1.getPunctuation() ;
    }
}
