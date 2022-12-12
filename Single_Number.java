// Problem Link : https://practice.geeksforgeeks.org/problems/single-number1014/0

// Brute-Force Approach : 

class Solution {
    int getSingle(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int i,count=1;
        int ele=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]==ele){
                count++;
            }
            else{
                if(count%2!=0){
                    return ele;
                }
                else{
                    ele=arr[i];
                    count=1;
                }
            }
        }
        if(count%2!=0){
            return ele;
        }
        else{
            return 0;
        }
    }
}

// Using XOR : 

class Solution {
    int getSingle(int arr[], int n) {
        // code here
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
