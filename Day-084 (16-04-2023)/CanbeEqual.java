class Solution {
    private static void reverse(int[] arr) {
        Arrays.sort(arr);
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        reverse(target);
        reverse(arr);

        if(Arrays.equals(target, arr)) 
            return true;
        return false;
    }
}
