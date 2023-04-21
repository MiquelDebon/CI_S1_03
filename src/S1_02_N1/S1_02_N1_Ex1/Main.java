package S1_02_N1.S1_02_N1_Ex1;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Author: Miquel Debón Villagrasa

        //------------EXERCICI 1-----------
        System.out.println(" --------Exercise 1----------");


        Month m1 = new Month("January");
        Month m2 = new Month("February");
        Month m3 = new Month("March");
        Month m4 = new Month("April");
        Month m5 = new Month("May");
        Month m6 = new Month("June");
        Month m7 = new Month("July");
        Month m8 = new Month("August"); //August!!
        Month m9 = new Month("September");
        Month m10 = new Month("October");
        Month m11 = new Month("November");
        Month m12 = new Month("December");

        ArrayList<Month> monthList = new ArrayList<Month>();
        monthList.add(m1);
        monthList.add(m2);
        monthList.add(m3);
        monthList.add(m4);
        monthList.add(m5);
        monthList.add(m6);
        monthList.add(m7);
        //monthList.add(m8);
        monthList.add(m9);
        monthList.add(m10);
        monthList.add(m11);
        monthList.add(m12);

        monthList.add(7, m8); //Inserció controlada amb index

        //Manté l'ordre correcte
        for (int i=0; i<monthList.size(); i++){
            System.out.println("Nº" + (i+1) + " - " + monthList.get(i).getName());
        }

        System.out.println();

        HashSet monthListSet = new HashSet<>(monthList); //Convert ArrayList to an HashSet

        for (int i=0; i<monthListSet.size(); i++){
            System.out.println("Nº" + (i+1) + " - " + monthList.get(i).getName());
        }
        System.out.println();

        //Iterator method
        Iterator i = monthListSet.iterator();
        int j = 1;
        while(i.hasNext()){
            System.out.println("Unidad " + j++ + " " + i.next().toString());

        }


    }
}
