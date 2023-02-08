package LeetCodeSolutions;

public class LCP_6_Merge_Sorted {

    public void start() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;

//        int[] nums1 = {1};
//        int m = 1;
//        int[] nums2 = {};
//        int n = 0;

//        int[] nums1 = {4,5,6,0,0,0};
//        int m = 3;
//        int[] nums2 = {1,2,3};
//        int n = 3;

        merge(nums1, m, nums2, n);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

    int i = m-1;
    int j = n-1;
    int k = m+n-1;

    while(i>=0 && j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k--] = nums1[i--];
        }
        else{
            nums1[k--] = nums2[j--];
        }
    }

    while(j>=0){
        nums1[k--] = nums2[j--];
    }



        for (int p = 0; p < nums1.length; p++) {
            System.out.println(nums1[p] + " ");
        }
    }


}
