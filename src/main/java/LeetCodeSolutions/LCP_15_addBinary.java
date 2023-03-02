package LeetCodeSolutions;

public class LCP_15_addBinary {

    public void start(){
        String a = "11";
        String b = "1";
        String res = addBinary(a,b);
        System.out.println(res);
    }

    public String addBinary(String a, String b) {
        int aCounter = a.length()-1;
        int bCounter = b.length()-1;
        int carry = 0;
        String res = "";

        while(aCounter>=0 || bCounter>=0){

            int aInt = 0;
            int bInt = 0;

            if(aCounter>=0){
                aInt = a.charAt(aCounter)-(int)'0';
                aCounter--;
            }
            if(bCounter>=0){
                bInt = (int)b.charAt(bCounter)-(int)'0';
                bCounter--;
            }
             // a = 11, b = 1
            int tempRes = aInt+bInt+carry;
            carry = tempRes/2;
            int temp = tempRes%2;
            res = temp+res;
        }

        if(carry>0){
            res = carry+res;
        }

        return res;


    }
}
