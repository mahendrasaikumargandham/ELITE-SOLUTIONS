class Solution {
    public void sortColors(int[] nums) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0)
                zero.add(nums[i]);
            else if(nums[i] == 1)
                one.add(nums[i]);
            else if(nums[i] == 2)
                two.add(nums[i]);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<zero.size();i++) {
            arr.add(zero.get(i));
        }
        for(int i=0;i<one.size();i++) {
            arr.add(one.get(i));
        }
        for(int i=0;i<two.size();i++) {
            arr.add(two.get(i));
        }
        for(int i=0;i<arr.size();i++) {
            nums[i] = arr.get(i);
        }
    }
}
