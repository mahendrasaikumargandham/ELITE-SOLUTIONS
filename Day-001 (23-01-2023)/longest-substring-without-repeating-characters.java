class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = 0;
        int j=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            while(j<=i && set.contains(ch)) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(ch);
            len = Math.max(len,i-j+1);
        }
        return len;
    }
}
