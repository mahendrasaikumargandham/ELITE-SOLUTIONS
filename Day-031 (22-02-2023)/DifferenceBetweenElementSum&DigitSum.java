class Solution {
    public int differenceOfSum(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
        int diff = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 9) {
                while(nums[i] != 0) {
                    arr.add(nums[i]%10);
                    nums[i] = nums[i]/10;
                }
            }
            else {
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++) {
            diff = diff + arr.get(i);
        }
        System.out.println(arr);
        return Math.abs(sum - diff);
    }
}
