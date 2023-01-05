// Problem Link : https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/

// Brute Force Approach :-

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[1], b[1]));
        int arrows = 1, cur = points[0][1];
        for(int i=1; i<points.length; i++){
            if(cur >= points[i][0]) continue;
            arrows++;
            cur = points[i][1];
        }
        return arrows;
    }
}

// Using Priority Queue :-

class Solution {
    public int findMinArrowShots(int[][] points) {
        int result = 0;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for (int []point : points) priorityQueue.add(point);
        if (priorityQueue.isEmpty()) return 0;
        while (!priorityQueue.isEmpty()) {
            int [] prev = priorityQueue.poll();
            while (!priorityQueue.isEmpty() && prev[1]>=priorityQueue.peek()[0] && prev[1]<=priorityQueue.peek()[1]) {
                priorityQueue.poll();
            }
            result++;
        }
        return result;
    }
}

// Using forEach loop (Less time complexity) :-
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        // integer overflow ,don't use a[1] -b[1]
        Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        
        int res= 1;
        int end =points[0][1];

        for(int[] point : points){

            if(point[0]>end){
                res++;
                end= point[1];
            }
        }
          return res;
    }
}
