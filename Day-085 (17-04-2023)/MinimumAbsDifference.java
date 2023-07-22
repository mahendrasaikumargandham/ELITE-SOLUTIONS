class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i+1]));
        }

        for(int i=0;i<arr.length-1;i++) {
            List<Integer> temp = new ArrayList<>();
            if(Math.abs(arr[i] - arr[i+1]) == min) {
                temp.add(arr[i]);
                temp.add(arr[i+1]);
            }

            if(!temp.isEmpty())
                list.add(temp);
        }

        System.out.println(list);

        return list;
    }
}
