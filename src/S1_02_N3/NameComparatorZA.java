package S1_02_N3;

import java.util.Comparator;

public class NameComparatorZA implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareToIgnoreCase(o1.getName());
    }
}
