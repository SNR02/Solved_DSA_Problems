// Problem Link : https://practice.geeksforgeeks.org/problems/214734e358208c1c6811d9b237b518f6b3c3c094/1

// My code (Passed most of the testcases but TLE for few testcases)
// BruteForce Approach :-

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        
        // 1 3 2 4  == 3 4 4 -1
        
        long[] res = new long[n];
        if(arr.length==1) return new long[]{-1};
        int i,j;
        long max,ele;
        for(i=0;i<n;i++){
            ele=arr[i];
            j=i+1;
            while(j<n){
                if(j==n-1 && arr[i]>arr[j]){
                    res[i]=-1;
                }
                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;
                }
                else{
                    j++;
                }
            }
        }
        res[n-1]=-1;
        return res;
    } 
}

// Code using stack :-

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        long[] ans = new long[n];
        Stack<Long> stack = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            while(stack.size()>0 && stack.peek()<=arr[i]) {
                stack.pop();
            }
            if(stack.size()==0) {
                ans[i]=-1;
            } else {
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    } 
}
