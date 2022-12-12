//This is my very first question at Leetcode 

Problem Link :- https://leetcode.com/problems/two-sum/

//BruteForce Solution :-

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length; i++){
            for(int j = i+1;j  < nums.length; j++){
                if(nums[i]+nums[j] == target)
                    return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//Using HashMap and 2 for-loops

class Solution {
    public int[] twoSum(int[] nums, int target) {
    int i;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(i=0;i<nums.length;i++){
            int secondnumber=target-nums[i];
            if(hm.containsKey(secondnumber)){
                return new int[] {hm.get(secondnumber),i};
            }
        }
        return new int[] {0};
    }
}

//Using HashMap and Single for-loop

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int secondnumber=target-nums[i];
            if(hm.containsKey(secondnumber)){
                return new int[] {hm.get(secondnumber),i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {0};
    }
}
