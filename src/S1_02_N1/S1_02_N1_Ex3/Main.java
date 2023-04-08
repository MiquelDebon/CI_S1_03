package S1_02_N1.S1_02_N1_Ex3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Exercise 3----------");

        //Read file
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferReader = null;
        BufferedWriter bufferedWriter = null;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Boolean dictionaryCreated = false;
        ArrayList<String> countries = new ArrayList<String>();

        try{
            fileReader = new FileReader("src/S1_02_N1/S1_02_N1_Ex3/countries.txt");
            bufferReader = new BufferedReader(fileReader);
            String text = "";
            while(text != null){
                text = bufferReader.readLine();
                if(text != null){
                    int index = text.indexOf(' ');
//                    System.out.println(text.substring(0,index));
//                    System.out.println(text.substring(index+1,text.length()));
                    hashMap.put(text.substring(0,index), (text.substring(index+1)));
                    countries.add(text.substring(0,index));
                }
            }
//            System.out.println(hashMap);  //Print the List of maps
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
            } catch (IOException e) {
            }
        }

        //Game starts HERE:
        if(dictionaryCreated){
            boolean rightAnswer = true;
            String playerName = "";
            String randomCountry = "";
            String cityGuessed = "";
            int mark = 0;

            playerName = Input.readString("What is your name = ✏️: ");
            System.out.println("You have 10 questions");

            for(int i = 1; i<=10 ; i++){
                randomCountry = countries.get((int)(Math.random()*(countries.size())));
                cityGuessed = Input.readString(String.format("What is the capital of '%s' ✏️: ", randomCountry));
                if(hashMap.get(randomCountry).equalsIgnoreCase(cityGuessed)){
                    System.out.println("✅ You did great");
                    mark++;
                }else{
                    System.out.println("❌ You failed! - Right answer was: " + hashMap.get(randomCountry));
                }
            }

            //WriteDown the mark of the player
            try {
                fileWriter = new FileWriter("src/S1_02_N1/S1_02_N1_Ex3/playersMark.txt", true);
                fileWriter.write( "\n" + playerName + " - " + mark);
//                bufferedWriter = new BufferedWriter(fileWriter);
//                bufferedWriter.write(playerName + " - " + mark );
            } catch (IOException e) {
                System.out.println("There is no such File to write down");
            }finally {
                try {
                    fileWriter.close();
//                    bufferedWriter.close();
                } catch (IOException e) {
                }
            }
            System.out.println("Result: " + playerName + " Mark: " + mark);
        }
    }
}
