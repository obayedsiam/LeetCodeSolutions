package LeetCodeSolutions;


// Link of the problem :
// https://leetcode.com/problems/add-two-numbers/

import java.util.ArrayList;


public class LCP_2_Two_Number {


    public void add() {

        int[] list_1_array = {9,9,9,9,9,9,9};
        int[] list_2_array = {9,9,9,9};
        ArrayList<Integer> outputArray = new ArrayList<>();

        ListNode head_1 = new ListNode(list_1_array[0]);
        ListNode curr = head_1;
        for (int i = 1; i < list_1_array.length; i++) {
            curr.next = new ListNode(list_1_array[i]);
            curr = curr.next;
        }

        ListNode head_2 = new ListNode(list_2_array[0]);
        ListNode curr_2 = head_2;
        for (int i = 1; i < list_2_array.length; i++) {
            curr_2.next = new ListNode(list_2_array[i]);
            curr_2 = curr_2.next;
        }

        ListNode output_head = addTwoNumbers(head_1, head_2);
        ListNode output = output_head.next;

        while(output!=null){
            outputArray.add(output.val);
            output = output.next;
        }

        System.out.println(outputArray);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int carry = 0;
        ListNode output_head = new ListNode();
        ListNode currentNode = output_head;

        while (l1 != null || l2 != null) {
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            int sum = carry + num1 + num2;
            carry = sum / 10;
            sum = sum % 10;
            ListNode newNode = new ListNode(sum);
            currentNode.next = newNode;
            currentNode = currentNode.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            currentNode.next = newNode;
            currentNode = currentNode.next;
        }
        return output_head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
