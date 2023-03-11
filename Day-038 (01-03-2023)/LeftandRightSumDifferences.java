class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        leftSum[0] = rightSum[rightSum.length-1] = 0;
        for(int i=1;i<leftSum.length;i++) {
            leftSum[i] = nums[i-1] + leftSum[i-1];
        }

        for(int  i=rightSum.length-2;i>=0;i--) {
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        for(int i=0;i<nums.length;i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return leftSum;
    }
}
