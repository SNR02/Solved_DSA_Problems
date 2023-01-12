// Problem Link : https://practice.geeksforgeeks.org/problems/86e609332c9ef4f6b8aa79db11a6c0808c4a1bca/1

// Code using Priority Queue :-

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        int i,x,y,temp;
        for(i=0;i<N;i++){
            pq.add(arr[i]);
        }
        while(pq.size()!=1){
            x=pq.poll();
            y=pq.poll();
            temp=x+y;
            sum+=temp;
            pq.add(temp);
        }
        return (long)sum;
    }
}
