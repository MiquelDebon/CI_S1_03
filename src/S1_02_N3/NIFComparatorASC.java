package S1_02_N3;

import java.util.Comparator;

public class NIFComparatorASC implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNIF().compareToIgnoreCase(o2.getNIF());
    }
}
