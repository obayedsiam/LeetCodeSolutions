package LeetCodeSolutions;

import java.util.HashMap;

public class LeetCodeProblem_1_Two_Sum {


    public void LeetCodeProblem_1_Two_Sum(){
        int [] nums = {2,7,11,15};
        int [] ret = twoSum(nums,26);
        System.out.println("[ "+ret[0]+","+ret[1]+" ]");
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int []ret = new int[2];

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                ret[0] = map.get(complement);
                ret[1] = i;
                break;
            }
            else{
                map.put(nums[i], i);
            }

        }
        return ret;
    }


    }
