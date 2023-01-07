// Problem Link : https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

// Code 1 :-

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> a1 = new ArrayList<Integer>();
        Set<Integer> hs = new HashSet<Integer>();
        int i;
        for(i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                a1.add(nums[i]);
            }
            hs.add(nums[i]);
        }
        return a1;
    }
}

// Code 2 :-

class Solution {
    public List<Integer> findDuplicates(int[] nums) { 
      List<Integer> l = new ArrayList(); 
      int x [] = new int [nums.length+1]; 
      for (int i : nums) {   
           x[i]++ ; 
           if(x[i]==2) l.add(i); 
      }
        return l ; 
    }
}

// Code 3 :-

class Solution{
    public List<Integer> findDuplicates(int[] nums){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:hm.keySet()){
            if(hm.get(x)==2){
                al.add(x);
            }
        }
        return al;
    }
}
