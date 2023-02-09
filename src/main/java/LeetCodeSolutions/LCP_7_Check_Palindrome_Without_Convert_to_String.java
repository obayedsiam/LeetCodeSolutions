package LeetCodeSolutions;

import java.util.Scanner;

public class LCP_7_Check_Palindrome_Without_Convert_to_String {

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        boolean isPalindrome = isPalindrome(n);
        System.out.println(n+" : " + isPalindrome);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int num = x;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse == x;
    }
}
