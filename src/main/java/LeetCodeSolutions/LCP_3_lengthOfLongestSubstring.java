package LeetCodeSolutions;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;
import java.util.Locale;

public class LCP_3_lengthOfLongestSubstring {

    public void lengthOfLongestSubstring() {

        lengthOfLongestSubstring("pwwkew");

    }

    public int lengthOfLongestSubstring(String s) {

        HashMap<String, Integer> newMap = new HashMap<>();

        s.toLowerCase(Locale.ROOT);
        char[] array = s.toCharArray();
        String substring = "";
        int subString_length = 0;

        int i = 0;
        while (i < array.length) {

            String currentLetter = array[i] + "";
            String prevLetter = "";

            if (substring.equals("")) {
                substring = currentLetter;
                subString_length = substring.length();
                newMap.put(substring, subString_length);
                prevLetter = currentLetter;

            } else {
                if (currentLetter.equals(prevLetter)) {
                    substring = "";
                    subString_length = 0;
//                    newMap.put(currentLetter, newMap.get(currentLetter) + 1);
                }
                else if(newMap.containsValue(currentLetter)){

                }
                substring = substring + currentLetter;
                newMap.put(substring,substring.length());
            }

        }


        return 0;
    }
}
