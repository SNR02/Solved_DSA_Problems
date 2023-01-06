// Problem Link : https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/

// BruteForce Approach :-

class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int result = 0, count = 0;
        for (int i = 0; i < tasks.length; i++) {
            count++;
            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {
                if (count == 1) {
                    return -1;
                }
                result += count / 3;
                if(count % 3 != 0) result++;
                count = 0;
           }
        }
        return result;
    }
}

// Using forEach loop :-

class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> getCount = new HashMap<>();
        for (int t : tasks) {
            getCount.put(t, getCount.getOrDefault(t, 0) + 1);
        }
        int result = 0;
        for (int count : getCount.values()) {
            if (count == 1) return -1;
            result += count / 3;
            if(count % 3 != 0) result++;
        }

        return result;
    }
}
