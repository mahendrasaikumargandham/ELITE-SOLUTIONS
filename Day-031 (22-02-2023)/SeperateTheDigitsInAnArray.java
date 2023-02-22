class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> total = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            List<Integer> arr = new ArrayList<>();
            if(nums[i] > 9) {
                while(nums[i] != 0) {
                    arr.add(nums[i]%10);
                    nums[i] = nums[i] / 10;
                }
            }
            else {
                arr.add(nums[i]);
            }
            Collections.reverse(arr);
            for(int j=0;j<arr.size();j++) {
                total.add(arr.get(j));
            }
        }
        System.out.println(total);
        int[] num = new int[total.size()];
        for(int i=0;i<total.size();i++) {
            num[i] = total.get(i);
        }

        return num;
    }
}
