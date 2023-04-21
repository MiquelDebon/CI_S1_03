package S1_03_N1.S1_03_N1_Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //------------EXERCICI 2-----------
        System.out.println("\n --------Exercise 2----------");


        List<Integer> integerList1= new ArrayList<Integer>();
        List<Integer> integerList2 = new ArrayList<Integer>();

        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);

        // Generate an iterator. Parameter Index = the size of the first List.
        ListIterator i2 = integerList1.listIterator(integerList1.size());
        while(i2.hasPrevious()){
            integerList2.add((Integer)i2.previous());
        }

        for(int number : integerList2){
            System.out.println(number);
        }
    }
}
