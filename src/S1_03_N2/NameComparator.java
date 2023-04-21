package S1_03_N2;

import java.util.Comparator;

public class NameComparator implements Comparator<Restaurant> {
    @Override
    //NO LA USO!!
    public int compare(Restaurant o1, Restaurant o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
