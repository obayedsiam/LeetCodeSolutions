package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LCP_13_Longest_Common_Prefix {

    public void start(){
        String ret = longestPrefix(new String[]{"Flower", "Flow", "Flight"});
        System.out.println(ret);
    }

    private class TrieNode {
        char ch;
        Map<Character, TrieNode> child = new HashMap<>();
        Boolean isWord = false;

        TrieNode(char ch) {
            this.ch = ch;
        }
    }

    public String longestPrefix(String[] wordList) {

        TrieNode root = new TrieNode(' ');

        for (String word : wordList) {

            TrieNode current = root;
            char[] letter = word.toCharArray();
            for (Character ch : letter) {
                current.child.putIfAbsent(ch,new TrieNode(ch));
                current = current.child.get(ch);
            }
            current.isWord = true;
        }
        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;

        while(current.child.size()==1 && current.isWord!=true){
            char ch = current.child.keySet().iterator().next();
            current = current.child.get(ch);
            prefix.append(ch);
        }
        return prefix.toString();
    }
}
