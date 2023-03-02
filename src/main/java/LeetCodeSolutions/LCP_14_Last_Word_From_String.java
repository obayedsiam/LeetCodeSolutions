package LeetCodeSolutions;

public class LCP_14_Last_Word_From_String {

    public void start(){
        String s =  "   fly me   to   the moon  " ;    //"Hello World Class Programmer"
        int length = lastWordLength(s);
        System.out.println(length);
    }
    public int lastWordLength(String s){
        s = s.trim();
        int index = s.lastIndexOf(" ");
        String substring = s.substring(index + 1);
        System.out.println(substring);
        return substring.length();
    }
}
