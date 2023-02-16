package LeetCodeSolutions;

//https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;

public class LCP_8_RomanToInteger {

    public void start(){
      int number = romanToInt("DCXXI");   //    LVIII = 58,   DCXXI = 621 , MCMXCIV = 1994
        System.out.println(number);
    }

    public int romanToInt(String s) {
        int convertedInteger = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int index = 0;
        while(index<s.length()){
            int presentNumber = map.get(s.charAt(index));

            int nextNumber = 0;
            if(index<s.length()-1){
                nextNumber=  map.get(s.charAt(index+1));
            }

            if(presentNumber<nextNumber){
                convertedInteger = convertedInteger + nextNumber-presentNumber;
                index = index+2;
            }
            else{
                convertedInteger = convertedInteger+presentNumber;
                index++;
            }
        }



        return convertedInteger;

    }
}
