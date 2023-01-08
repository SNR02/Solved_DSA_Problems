// Problem Link : https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/0

// Using HashMap (Standard Problem) :-

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long ans=0,sum=0;
        int i;
        HashMap<Long,Long> hm = new HashMap<>();
         for(i=0;i<n;i++){
             sum+=arr[i];
             if(sum==0){
                 ans++;
             }
             if(hm.containsKey(sum)){
                 ans+=hm.get(sum);
             }
             
             hm.put(sum,hm.getOrDefault(sum,0L)+1L);
         }
         return ans;
    }
}
