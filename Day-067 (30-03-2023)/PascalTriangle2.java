class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);

        for(int i=1;i<=rowIndex;i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);

            for(int k=1;k<arr.size();k++) {
                list.add(arr.get(k-1)+arr.get(k));
            }
            list.add(1);
            arr = list;
        }
        return arr;
    }
}
