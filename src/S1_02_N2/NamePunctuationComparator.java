package S1_02_N2;

import java.util.Comparator;

public class NamePunctuationComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        if(o1.getName().equalsIgnoreCase(o2.getName())){
            return o2.getPunctuation() - o1.getPunctuation() ;
        }else{
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }

}
