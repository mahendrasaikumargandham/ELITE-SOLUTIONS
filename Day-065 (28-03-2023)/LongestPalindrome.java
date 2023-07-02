class Solution {
    private int func(String s, int start, int end) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end-start-1;
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for(int i=0;i<s.length();i++) {
            int odd = func(s, i, i);
            int even = func(s, i, i+1);

            int len = Math.max(odd, even);

            if(len > end - start) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }

        return s.substring(start, end+1);
    }
}
