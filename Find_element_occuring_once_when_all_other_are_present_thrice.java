// Problem Link : https://practice.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/0

// All the elements in a given array is repeated thrice
// we have to find the element appeared once

class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int i;
        int setsum=0,arrsum=0;
        HashSet<Integer> hs = new HashSet<>();
        for(i=0;i<N;i++){
            hs.add(arr[i]);
        }
        for(int temp : hs){
            setsum+=temp;
        }
        for(i=0;i<N;i++){
            arrsum+=arr[i];
        }
        return (3*(setsum)-arrsum)/2;
    }
}

// Consider arr[] = {1, 10, 1, 1}
// Add all arrays elements ina hashset 
// HashSet = [1,10]   (no duplicates)
// Find sum of elements in hashset => setsum = 1+10 = 11
// Find the sum of elements in the given array => arrsum = 1+10+1+1 = 13
// Now multiplying setsum with 3 => 3*11 = 33 (since the repeatation is 3 times) and subtracting arrsum => 33-13 = 20
// Dividing this by 2 gives the unique element => 20/2 = 10
