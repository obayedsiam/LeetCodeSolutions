package LeetCodeSolutions;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LCP_3_lengthOfLongestSubstring {

    public void lengthOfLongestSubstring() {

        lengthOfLongestSubstring("pwwkew");

    }

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int res = 0;

        while (right < s.length()) {

            char charAtRight = s.charAt(right);
            char charAtLeft = s.charAt(left);
            if (!set.contains(charAtRight)) {
                set.add(charAtRight);
                res = Math.max(res, set.size());
                right++;
            } else {
                set.remove(charAtLeft);
                left++;
            }

        }
        return res;
    }
}
