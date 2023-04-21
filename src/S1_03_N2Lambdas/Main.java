package S1_03_N2Lambdas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //HashSet and Overriding equal()/hasCode() methods makes there are no exist double instance of what we want
        Set<Restaurant2> listRestaurant2 = new HashSet<>();

        listRestaurant2.add(new Restaurant2("Restaurant_01", 10));
        listRestaurant2.add(new Restaurant2("Restaurant_02", 10));
        listRestaurant2.add(new Restaurant2("Restaurant_01", 8));
        listRestaurant2.add(new Restaurant2("Restaurant_01", 10)); //It's a copy of restaurant01
        listRestaurant2.add( new Restaurant2("Restaurant_09", 3));
        System.out.println("Basic List");
        listRestaurant2.forEach(System.out::println);

        //Exercise1 - by Name
        System.out.println("\nColección ordenada por Nombre:");
        listRestaurant2.stream()
                        .sorted(Comparator.comparing(Restaurant2::getName))
                        .forEach(System.out::println);

        //Exercise2 - by Name + Punctuation
        System.out.println("\nColección ordenada por puntuación:");
        listRestaurant2.stream()
                        .sorted(Comparator.comparing(Restaurant2::getPunctuation))
                        .forEach(System.out::println);


        System.out.println("\nOrdenada por dos valores:");
        listRestaurant2.stream()
                        .sorted(Comparator.comparing(Restaurant2::getName)
                                .thenComparing(Restaurant2::getPunctuation))
                        .forEach(System.out::println);





    }
}
