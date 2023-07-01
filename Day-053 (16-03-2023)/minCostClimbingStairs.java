class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int step1 = 0;
        int step2 = 0;

        for(int i=cost.length-1;i>=0;i--) {
            int curr = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = curr;
        }
        
        return Math.min(step1, step2);
    }
}
