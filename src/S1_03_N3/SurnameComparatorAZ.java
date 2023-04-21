package S1_03_N3;

import java.util.Comparator;

public class SurnameComparatorAZ implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSurname().compareToIgnoreCase(o2.getSurname());
    }
}
