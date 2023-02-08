package LeetCodeSolutions;

import java.math.BigDecimal;

public class LCP_5_OnePlus {

    public void start(){

        int [] num = {9,8,7,6,5,4,3,2,1,0};
        int [] n = plusOne(num);
        System.out.println(n);

        }
    public int[] plusOne(int[] digits) {

            int rem = 0;
            int add = 1;
        for(int i=digits.length-1;i>=0;i--){
            int current = digits[i];
            int sum = current+add+rem;
            add = 0;
            int value = sum%10;
            digits[i] = value;
            rem = sum/10;
        }
        int [] newint = new int[digits.length+1];
        if(rem>0){
            newint[0] = rem;

            for(int i=1;i<newint.length;i++)
            {
               newint[i] = digits[i-1];
            }
            return newint;
        }
        else return  digits;

//        Double digit = 0.0;
//        int power = 0;
//
//        for(int i=digits.length-1;i>=0;i--){
//            Double number = digits[i]*Math.pow(10,power);
//            digit = digit+number;
//            power = power+1;
//        }
//
//        int incrementedDigit = (int)(digit+1);
//
//        String n = incrementedDigit+"";
//        char[] number = n.toCharArray();
//        int [] num = new int[number.length];
//
//        int index = num.length-1;
//
//        while(incrementedDigit!=0){
//            num[index] = incrementedDigit%10;
//            incrementedDigit = incrementedDigit/10;
//            index--;
//        }
//        return num;
    }
}
