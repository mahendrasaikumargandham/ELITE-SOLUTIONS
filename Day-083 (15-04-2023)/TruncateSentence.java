class Solution {
    public String truncateSentence(String s, int k) {
        String[] builder = s.split("\\s");

        String[] res = new String[k];

        for(int i=0;i<k;i++) {
            res[i] = builder[i];
        }

        String word = "";
        for(int i=0;i<res.length;i++) {
            word = word + res[i] + " ";
        }

        return word.trim();
    }
}
