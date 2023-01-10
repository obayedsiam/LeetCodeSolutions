package HashMap;

import java.sql.SQLOutput;
import java.util.*;

public class Finding_First_Non_Repeated_Letter {


    public void Finding_First_Non_Repeated_Letter(){
        find();
    }
    public void find() {
        String str = "a green apple";
        Map<Character,Integer> newMap = new HashMap<>(str.length());

        char[] inputChar = str.toCharArray();

        for (int i = 0; i < inputChar.length; i++) {
            char temp = inputChar[i];
            newMap.put(temp,newMap.containsKey(temp)?newMap.get(temp)+1:1);
        }
        for (var entry : inputChar) {
            if (newMap.get(entry)==1) {
                System.out.println("The first non repeated character found is : "+entry);
                break;
            }
        }

    }
}
