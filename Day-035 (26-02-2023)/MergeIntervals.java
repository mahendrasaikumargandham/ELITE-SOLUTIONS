class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);

        List<int[]> arr = new ArrayList<>();
        arr.add(intervals[0]);

        int j = 0;
        for(int i=1;i<intervals.length;i++) {
            int[] temp = arr.get(j);
            if(intervals[i][0] <= temp[1]) 
                temp[1] = Math.max(temp[1], intervals[i][1]);
            else {
                arr.add(intervals[i]);
                j++;
            }
        }

        int[][] res = new int[j+1][2];
        for(int i=0;i<res.length;i++) {
            res[i] = arr.get(i);
        }

        return res;
    }
}
