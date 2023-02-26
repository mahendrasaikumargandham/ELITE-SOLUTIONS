class Solution {
    static void setZeroes(int [][] matrix) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    arr1.add(i);
                    arr2.add(j);
                }
            }
        }

        for(Integer i: arr1) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j] = 0;
            }
        }

        for(Integer i:arr2) {
            for(int j=0;j<matrix.length;j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
