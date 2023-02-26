class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = null;
        List<Integer> node;

        for(int i=0;i<numRows;i++) {
            node = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j == 0 || j == i)
                    node.add(1);
                else
                    node.add(temp.get(j-1)+temp.get(j));
            }
            temp = node;
            arr.add(node);
        }
        return arr;
    }
}
