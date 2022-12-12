// Problem Link : https://practice.geeksforgeeks.org/problems/permutations-in-array1747/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

// Some boring approach with more time complexity
// But you can't find this on internet 😉

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        int i;
        Integer[] b2 = new Integer[n];
        int[] b1 = new int[n];
        for(i=0;i<n;i++){
            b1[i]=(int)b[i];
        }
        for(i=0;i<n;i++){
            b2[i]=(Integer)b1[i];
        }
        Arrays.sort(b2,Collections.reverseOrder());
        int count=0;
        for(i=0;i<n;i++){
            if(a[i]+b2[i]>=k){
                count++;
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
}

//Simple Approach : 

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int i,j;
        for(i=0;i<n;i++){
            if(a[i]+b[n-i-1]>=k){
                count++;
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
}
