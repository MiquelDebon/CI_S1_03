package S1_03_N1.S1_03_N1_Ex3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Exercise 3--------");

        //Read file
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferReader = null;
        BufferedWriter bufferedWriter = null;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        boolean dictionaryCreated = false;
        ArrayList<String> countries = new ArrayList<String>();

        try{
            fileReader = new FileReader("src/S1_03_N1/S1_03_N1_Ex3/countries.txt");
            bufferReader = new BufferedReader(fileReader);
            String line = "";
            while(line != null){
                line = bufferReader.readLine();
                if(line != null){
                    int endIndex = line.indexOf(' ');
                    String key = line.substring(0, endIndex);
                    String value = line.substring(++endIndex);
                    hashMap.put(key, value);
                    countries.add(key);
                }
            }
            System.out.println(hashMap);  //Print the List of maps
            dictionaryCreated = true;
        }catch (FileNotFoundException fnfe){
            System.out.println("There is no such file");
        } catch (IOException e) {
            System.out.println("Somethig happend with the file");
        }catch (StringIndexOutOfBoundsException siobe){
            System.out.println("The are odd String pairs");
        }
        finally {
            try {
                fileReader.close();
                bufferReader.close();
            } catch (IOException e) {
            }
        }

        //The fun part starts HERE:
        if(dictionaryCreated){
            String playerName = "";
            String randomCountry = "";
            String cityGuessed = "";
            int mark = 0;

            playerName = Input.readString("What is your name = ✏️: ");
            System.out.println("You have 10 questions");

            for(int i = 1; i<=10 ; i++){
                randomCountry = countries.get((int)(Math.random()*(countries.size())));
                cityGuessed = Input.readString(String.format("%d) What is the capital of '%s' ✏️: ",i, randomCountry));
                if(hashMap.get(randomCountry).equalsIgnoreCase(cityGuessed)){
                    System.out.println("✅ You did great");
                    mark++;
                }else{
                    System.out.println("❌ You failed! - Right answer was: " + hashMap.get(randomCountry));
                }
            }

            //WriteDown the mark of the player
            try {
                fileWriter = new FileWriter("src/S1_03_N1/S1_03_N1_Ex3/playersMark.txt", true);
                fileWriter.write( "\n" + playerName + " - " + mark);
//                bufferedWriter = new BufferedWriter(fileWriter);
//                bufferedWriter.write(playerName + " - " + mark );
            } catch (IOException e) {
                System.out.println("There is no such File to write down your score " + playerName);
            }finally {
                try {
                    fileWriter.close();
//                    bufferedWriter.close();
                } catch (IOException e) {
                }
            }
            System.out.println("Result: " + playerName + " Mark: " + mark);
        }else{
            System.out.println("❌ There was an error - No game!");
        }
    }
}
