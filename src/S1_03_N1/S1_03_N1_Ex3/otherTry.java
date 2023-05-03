package S1_03_N1.S1_03_N1_Ex3;

import java.io.*;
import java.util.HashMap;
import java.util.stream.Stream;

public class otherTry {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        HashMap<String, String> hashMap = new HashMap<>();

        try{
            fileReader = new FileReader("src/S1_03_N1/S1_03_N1_Ex3/countries.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while(line != null){
                line = bufferedReader.readLine();
                if(line != null){
                    int endIndex = line.indexOf(" ");
                    String key = line.substring(0, endIndex);
                    String value = line.substring(++endIndex);
                    hashMap.put(key, value);
                }
            }
            System.out.println(hashMap);
        }catch (FileNotFoundException fne){
            System.out.println("No such file");
        } catch (IOException e) {
            System.out.println("An error occure");
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
            }
        }
    }
}

