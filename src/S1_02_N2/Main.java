package S1_02_N2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> listRestaurant = new HashSet<Restaurant>();

        Restaurant restaurant01 = new Restaurant("Restaurant_01", 10);
        Restaurant restaurant02 = new Restaurant("Restaurant_02", 10);
        Restaurant restaurant03 = new Restaurant("Restaurant_01", 8);
        Restaurant restaurant04 = new Restaurant("Restaurant_01", 10); //It's a copy of restaurant01
        Restaurant restaurant05 = new Restaurant("Restaurant_09", 3);

        listRestaurant.add(restaurant01);
        listRestaurant.add(restaurant02);
        listRestaurant.add(restaurant03);
        listRestaurant.add(restaurant04); //It's a copy of restaurant01
        listRestaurant.add(restaurant05);

        System.out.println(listRestaurant); //Sin orden es un HashSet




        /*  TreeSet   Ordenador por el metodo compareTo (I-Comparable)
            Aslo only allow no duplicate by the current comparation = method CompareTo = punctuation     */
        System.out.println("Colección ordenada por puntuación:");
        TreeSet<Restaurant> listSetRestaurant = new TreeSet<>(listRestaurant); //
        System.out.println(listSetRestaurant);

        /*  Tree ordenaor segur Comparator
            Aslo only allow no duplicate by the current comparation = method Compare = Name       */
        System.out.println("Colección ordenasa por nombre");
        Comparator<Restaurant> comparator = new Restaurant(); //Este Comparator obtiene el metodo compare de la Clase Restaurante
        TreeSet<Restaurant> listCompareRestaurant = new TreeSet<>(comparator);
            listCompareRestaurant.add(restaurant01);
            listCompareRestaurant.add(restaurant02);
            listCompareRestaurant.add(restaurant03);
            listCompareRestaurant.add(restaurant04);
            listCompareRestaurant.add(restaurant05);
        System.out.println(listCompareRestaurant);

        List<Restaurant> restaurantsList = new ArrayList<Restaurant>(listRestaurant);
        /* DOES NOT WORK - Quan ordena el segon, només ho ha amb segon criteri
        Collections.sort(restaurantsList, new NameComparator());
        Collections.sort(restaurantsList, new PunctuationComparator());
        System.out.println(restaurantsList); */

        System.out.println("\nColección Lista ordenada por dos valores:");
        Collections.sort(restaurantsList, new NamePunctuationComparator());
        System.out.println(restaurantsList);

    }
}
