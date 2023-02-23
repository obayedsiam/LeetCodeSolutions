package LeetCodeSolutions;

import java.util.*;

public class LCP_9_ValidParenthesis {

    public void start(){

      boolean isValid = isValid("[]");
        System.out.println("The given parenthesis is valid : ");
    }

    public boolean isValid(String s) {
        boolean isValid = false;
        Map<Character, Integer> leftP = new HashMap<>();
        Map<Character, Integer> rightP = new HashMap<>();

        leftP.put('(',1);
        leftP.put('{',2);
        leftP.put('[',3);

        rightP.put(')',1);
        rightP.put('}',2);
        rightP.put(']',3);

        Stack<Character> startP = new Stack();
        Stack<Character> endP = new Stack();

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(leftP.containsKey(current)){
                startP.push(current);
            }
            else endP.push(current);
        }

        while(!startP.empty()){

            char left = startP.pop();
            char right = endP.pop();

            if(leftP.get(left)!=rightP.get(right)){
                isValid = false;
                break;
            }

        }


        return isValid;
    }
}
