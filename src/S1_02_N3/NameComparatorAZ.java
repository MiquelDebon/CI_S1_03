package S1_02_N3;

import java.util.Comparator;

public class NameComparatorAZ implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
