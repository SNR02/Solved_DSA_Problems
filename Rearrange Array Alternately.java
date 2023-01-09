// Problem Link : https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/0

// Brute Force Code :-

class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long[] res = new long[n];
        long[] res2 = new long[n];
        int i;
        long temp=0,temp1=0,temp3=0,temp4=0;
        for(i=0;i<n;i++){
            res[i]=arr[n-i-1];
        }
        for(i=0;i<n;i++){
            res2[i]=arr[i];
        }
        for(i=0;i<n;i++){
            if(i%2==0){
                temp=arr[i];
                arr[i]=res[(int)temp1];
                temp1++;
            }
            if(i%2!=0){
                temp3=arr[i];
                arr[i]=res2[(int)temp4];
                temp4++;
            }
        }
    }
    
}
