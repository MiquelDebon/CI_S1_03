package S1_03_N3;

import java.util.Comparator;

public class NIFComparatorDESC implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getNIF().compareToIgnoreCase(o1.getNIF());
    }
}
