class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;
        while(sequence.contains(word)) {
            count += 1;
            word += temp;
        }
        return count;
    }
}
