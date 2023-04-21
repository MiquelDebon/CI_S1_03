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
        Comparator<Restaurant> comparatorRestaurant = new Restaurant(); //Este Comparator obtiene el metodo compare de la Clase Restaurante
        Comparator<Restaurant> comparatorNamePunct = new NamePunctuationComparator();

        //--------------------------------------------

        //Exercise2-Option1 - by Name + Punctuation
        TreeSet<Restaurant> restaurantsByNamePunctTreeSet = new TreeSet<Restaurant>();
        restaurantsByNamePunctTreeSet.add(new Restaurant("Restaurant_01", 10));
        restaurantsByNamePunctTreeSet.add(new Restaurant("Restaurant_02", 10));
        restaurantsByNamePunctTreeSet.add(new Restaurant("Restaurant_01", 8));
        restaurantsByNamePunctTreeSet.add(new Restaurant("Restaurant_01", 10));
        restaurantsByNamePunctTreeSet.add(new Restaurant("Restaurant_09", 3));
        printList("Ex2-Option2) TreeSet ", restaurantsByNamePunctTreeSet);

        //Exercise2-Option2 - by Name + Punctuation
        List<Restaurant> restaurantsByNamePunctList = new ArrayList<Restaurant>(restaurantsSet);
        Collections.sort(restaurantsByNamePunctList, comparatorRestaurant);
        printList("Ex2-Option1) List ", restaurantsByNamePunctList);


        //Exercise2-Option3 - by Name + Punctuation
        List<Restaurant> restaurantsList = new ArrayList<Restaurant>(restaurantsSet);
        Collections.sort(restaurantsList, new NamePunctuationComparator());
        printList("Ex2-Option3) List :", restaurantsList);

    }

    public static void printList(String mensaje, Collection<Restaurant> collection){
        System.out.println("\n" + mensaje);
        collection.forEach(System.out::println);
    }
}
