package S1_03_N3Lambdas;

import java.io.*;
import java.util.ArrayList;
//import com.opencsv.CSVWriter;

public class File {
    public static ArrayList<Person> readFile(){
        //IMPORT
        FileReader fileReader;
        BufferedReader bf;
        ArrayList<Person> people = new ArrayList<Person>();
        String csvSeparator = ",";
        String line = "";

        try {
            fileReader = new FileReader("src/S1_02_N3/table.csv");
            bf = new BufferedReader(fileReader);
            bf.readLine();  //Skip the title (First line)

            while((line = bf.readLine()) != null){
                String[] data = line.split(csvSeparator);
                people.add(new Person(data[0], data[1], data[2]));
            }
            fileReader.close();
            bf.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("NO such file");
        } catch (IOException e) {
            System.out.println("Corrupt file");
        }
        return null;
    }

    public static void writeCSV(Person person){
        FileWriter fileWriter;
        PrintWriter pw ;

        try {
            fileWriter = new FileWriter("src/S1_02_N3/table.csv", true);
            pw = new PrintWriter(fileWriter);
            pw.write( "\n" + person.getName() + "," + person.getSurname() + "," + person.getNIF());
            pw.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("There is no such File to write down");
        }
        System.out.println("Person added: " + person.getName() + "," + person.getSurname() + "," + person.getNIF());
    }


}
