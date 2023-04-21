package S1_03_N3Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static List<Person> people = new ArrayList<>(File.readFile());
    public static void main(String[] args) {
        boolean exitProgram = false;
        System.out.println("Welcome to CSV Read File - By Miquel Debón Villagrasa");

        do{
            switch(menu()){
                case 1 :
                    String name = Input.readString("Name: ");
                    String surname = Input.readString("Surname: ");
                    String NIF = Input.readString("NIF: ");
                    File.writeCSV(new Person(name, surname, NIF));
                    break;
                case 2:
                    peopleByNameAZ();
                    break;
                case 3:
                    peopleByNameZA();
                    break;
                case 4 :
                    peopleBySurnameAZ();
                    break;
                case 5:
                    peopleBySurameZA();
                    break;
                case 6:
                    peopleByNIFASC();
                    break;
                case 7:
                    peopleByNIFDESC();
                    break;
                case 0:
                    exitProgram = true;
                    break;
            }
        }while(!exitProgram);
    }

    public static int menu(){
        System.out.println( "\n------------------------MAIN MENU-----------------------\n" +
                            "   1.- Introduir persona.\n" +
                            "   2.- Mostrar les persones ordenades per nom (A-Z).\n" +
                            "   3.- Mostrar les persones ordenades per nom (Z-A).\n" +
                            "   4.- Mostrar les persones ordenades per cognoms (A-Z).\n" +
                            "   5.- Mostrar les persones ordenades per cognoms (Z-A).\n" +
                            "   6.- Mostrar les persones ordenades per DNI (1-9).\n" +
                            "   7.- Mostrar les persones ordenades per DNI (9-1).\n" +
                            "   0.- Sortir.");
        return Input.readInteger("Write your option ✏️: ");
    }


    public static void peopleByNameAZ(){
        System.out.println("Option 2:");
        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                        .forEach(System.out::println);
    }
    public static void peopleByNameZA(){
        System.out.println("Option 3:");
        people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
    }
    public static void peopleBySurnameAZ(){
        System.out.println("Option 4:");
        people.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .forEach(System.out::println);
    }
    public static void peopleBySurameZA(){
        System.out.println("Option 5:");
        people.stream()
                .sorted(Comparator.comparing(Person::getSurname).reversed())
                .forEach(System.out::println);
    }
    public static void peopleByNIFASC(){
        System.out.println("Option 6:");
        people.stream()
                .sorted(Comparator.comparing(Person::getNIF))
                .forEach(System.out::println);
    }
    public static void peopleByNIFDESC(){
        System.out.println("Option 7:");
        people.stream()
                .sorted(Comparator.comparing(Person::getNIF).reversed())
                .forEach(System.out::println);
    }
}
