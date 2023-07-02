class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        for(int i=arr.size()-2;i>=0;i--) {
            for(int j=0;j<arr.get(i).size();j++) {
                int min = Math.min(arr.get(i+1).get(j), arr.get(i+1).get(j+1));
                int sum = min + arr.get(i).get(j);
                arr.get(i).set(j, sum);
            }
        }

        return arr.get(0).get(0);
    }
}
