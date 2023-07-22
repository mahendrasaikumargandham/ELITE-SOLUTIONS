class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concate = 0;
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            String temp = "";

            if(start == end) {
                temp = temp + nums[start];
            }
            else {
                temp = temp + nums[start];
                temp = temp + nums[end];
            }
            concate = concate + Integer.parseInt(temp);
            start++;
            end--;
        }

        return concate;
    }
}
