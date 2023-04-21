package S1_03_N3;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Person> People= new ArrayList<>(File.readFile());
    public static void main(String[] args) {
        boolean exitProgram = false;
        System.out.println("Welcome to CSV Read File - By Miquel Debón Villagrasa");

        do{
            switch(menu()){
                case 1 :
                    String name = S1_01_N2.Input.readString("Name: ");
                    String surname = S1_01_N2.Input.readString("Surname: ");
                    String NIF = S1_01_N2.Input.readString("NIF: ");
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
        System.out.println( "   1.- Introduir persona.\n" +
                            "   2.- Mostrar les persones ordenades per nom (A-Z).\n" +
                            "   3.- Mostrar les persones ordenades per nom (Z-A).\n" +
                            "   4.- Mostrar les persones ordenades per cognoms (A-Z).\n" +
                            "   5.- Mostrar les persones ordenades per cognoms (Z-A).\n" +
                            "   6.- Mostrar les persones ordenades per DNI (1-9).\n" +
                            "   7.- Mostrar les persones ordenades per DNI (9-1).\n" +
                            "   0.- Sortir.");
        return S1_01_N2.Input.readInteger("Write your option ✏️: ");
    }

    public static void printList(){
        for(Person p : People){
            System.out.println(p);
        }
    }

    public static void peopleByNameAZ(){
        System.out.println("Option 1:");
        Collections.sort(People, new NameComparatorAZ());
        printList();
    }
    public static void peopleByNameZA(){
        System.out.println("Option 1:");
        Collections.sort(People, new NameComparatorZA());
        printList();
    }
    public static void peopleBySurnameAZ(){
        System.out.println("Option 1:");
        Collections.sort(People, new SurnameComparatorAZ());
        printList();
    }
    public static void peopleBySurameZA(){
        System.out.println("Option 1:");
        Collections.sort(People, new SurnameComparatorZA());
        printList();
    }
    public static void peopleByNIFASC(){
        System.out.println("Option 1:");
        Collections.sort(People, new NIFComparatorASC());
        printList();
    }
    public static void peopleByNIFDESC(){
        System.out.println("Option 1:");
        Collections.sort(People, new NIFComparatorDESC());
        printList();
    }
}
