package S1_03_N3;

import java.util.Comparator;

public class SurnameComparatorZA implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getSurname().compareToIgnoreCase(o1.getSurname());
    }
}
