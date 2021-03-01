package com.sultana;
public class Recursion {

    public static void main(String[] args) {
        int[] numbs= new int[]{2,4,8};
        int target = 10;
        Recursion recursionReturn = new Recursion();

       boolean isGroupSumClump = recursionReturn.groupSumClump(0, numbs, 10);
        System.out.println(isGroupSumClump);
    }


    public boolean groupSumClump(int start, int[] nums,int target){
        if(target == 0) return true;
        else if(start >= nums.length) return false;
        else {
            int end = start;
            while(end <nums.length && nums[end] == nums[start]) end++;
            int length = end-start;
            return groupSumClump(end,nums,target) || groupSumClump(end,nums,target-nums[start]);
        }

    }
}
