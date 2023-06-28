class Solution {
    public void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0;i<n1;i++) 
            leftArr[i] = nums[start+i];
        
        for(int i=0;i<n2;i++) 
            rightArr[i] = nums[mid+1+i];

        int i = 0;
        int j = 0;
        int k = start;

        while(i < n1 && j < n2) {
            if(leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            }
            else {
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < n2) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] nums, int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);
            merge(nums, start, mid, end);
        }
    }

    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        Solution instance = new Solution();
        instance.mergeSort(nums, start, end);
        return nums;
    }
}
