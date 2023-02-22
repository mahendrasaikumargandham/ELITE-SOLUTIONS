class Solution {

    public boolean required(int mid, int[] arr, int days) {
        int sum = 0;
        int d = 1;
        for(int i=0;i<arr.length;i++) {
            if(sum+arr[i] <= mid) 
                sum = sum + arr[i];
            else {
                sum = arr[i];
                d = d+1;
            }
        }

        if(d<=days) 
            return true;

        return false;
    }

    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        int result = 0;
        for(int i=0;i<weights.length;i++) {
            if(min<weights[i])
                min = weights[i];
            max = max + weights[i];
        }

        int low = min;
        int high = max;

        while(low <= high) {
            int mid = (low + high)/2;
            if(required(mid, weights, days)) {
                result = mid;
                high = mid-1;
            }
            else 
                low = mid+1;
        }
        return result;
    }
}
