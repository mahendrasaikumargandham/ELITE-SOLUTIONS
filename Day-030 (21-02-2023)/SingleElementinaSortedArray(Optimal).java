class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) 
            return nums[0];
            
        int start = 0;
        int end = nums.length-1;

        if(nums[start] != nums[start+1])
            return nums[start];

        if(nums[end] != nums[end-1])
            return nums[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            
            else if((nums[mid] != nums[mid-1] && mid % 2 == 0) || (nums[mid] != nums[mid+1] && mid % 2 != 0)) 
                start = mid + 1;
            else 
                end = mid - 1;
        } 
        return nums[start];
    }
}
