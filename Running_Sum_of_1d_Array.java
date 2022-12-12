// Problem link : https://leetcode.com/problems/running-sum-of-1d-array/description/

// 1 ms code :

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ex= new int[nums.length];
        int prevsum=0;
        int i;
        for(i=0;i<nums.length;i++){
            prevsum+=nums[i];
            ex[i]=prevsum;
        }
        return ex;
    }
}

// 0 ms code : 

class Solution{
    public int[] runningSum(int[] nums){
        int i,prevsum=0;
        for(i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
