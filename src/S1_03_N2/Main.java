package S1_03_N2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //HashSet and Overriding equal()/hasCode() methods makes there are no exist double instance of what we want
        Set<Restaurant> restaurantsSet = new HashSet<Restaurant>();

        restaurantsSet.add(new Restaurant("Restaurant_01", 10));
        restaurantsSet.add(new Restaurant("Restaurant_02", 10));
        restaurantsSet.add(new Restaurant("Restaurant_01", 8));
        restaurantsSet.add(new Restaurant("Restaurant_01", 10)); //It's a copy of restaurant01
        restaurantsSet.add(new Restaurant("Restaurant_09", 3));
        printList("Ex1) Lista base HashSet - sin orden peero sin duplicados", restaurantsSet); //Sin orden es un HashSet

        //Trying TreeSet
        /*  TreeSet   Ordenador por el metodo compareTo (I-Comparable)
            Aslo only allow no duplicate by the current comparation = method CompareTo = punctuation
        TreeSet<Restaurant> listSetRestaurant = new TreeSet<>(restaurantsSet);
        printList("Ex1) TreeSet ordenada por puntuación", listSetRestaurant);*/


        //Exercise1 - by Name
        Comparator<Restaurant> comparatorName = new NameComparator();
        Comparator<Restaurant> comparatorNamePunctRestaurant = new Restaurant(); //Este Comparator obtiene el metodo compare de la Clase Restaurante

        //--------------------------------------------

        //Exercise2-Option1 - by Name + Punctuation  -> El TreeSet obtiene el compareTo de Restaurante
        TreeSet<Restaurant> rest_N2_Ex2_Opt1_TreeSet = new TreeSet<Restaurant>();
        rest_N2_Ex2_Opt1_TreeSet.add(new Restaurant("Restaurant_01", 10));
        rest_N2_Ex2_Opt1_TreeSet.add(new Restaurant("Restaurant_02", 10));
        rest_N2_Ex2_Opt1_TreeSet.add(new Restaurant("Restaurant_01", 8));
        rest_N2_Ex2_Opt1_TreeSet.add(new Restaurant("Restaurant_01", 10));
        rest_N2_Ex2_Opt1_TreeSet.add(new Restaurant("Restaurant_09", 3));
        printList("Ex2-Option1) TreeSet ", rest_N2_Ex2_Opt1_TreeSet);

        //Exercise2-Option2 - by Name + Punctuation
        List<Restaurant> rest_N2_Ex2_Opt2 = new ArrayList<Restaurant>(restaurantsSet);
        Collections.sort(rest_N2_Ex2_Opt2, comparatorNamePunctRestaurant);
        printList("Ex2-Option2) List ", rest_N2_Ex2_Opt2);


        //Exercise2-Option3 - by Name + Punctuation
        List<Restaurant> rest_N2_Ex2_Opt3 = new ArrayList<Restaurant>(restaurantsSet);
        Collections.sort(rest_N2_Ex2_Opt3, new NamePunctuationComparator());
        printList("Ex2-Option3) List :", rest_N2_Ex2_Opt3);

    }

    public static void printList(String mensaje, Collection<Restaurant> collection){
        System.out.println("\n" + mensaje);
        collection.forEach(System.out::println);
    }
}
