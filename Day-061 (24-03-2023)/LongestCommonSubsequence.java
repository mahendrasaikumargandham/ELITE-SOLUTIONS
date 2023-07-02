class Solution {
    private int func(int[][] dp, String s1, String s2, int i1, int i2) {
        if(i1 == s1.length() || i2 == s2.length()) 
            return 0;
        
        if(dp[i1][i2] >= 0) 
            return dp[i1][i2];
        if(s1.charAt(i1) == s2.charAt(i2))
            dp[i1][i2] = 1 + func(dp, s1, s2, i1+1, i2+1);
        else {
            dp[i1][i2] = Math.max(func(dp, s1, s2, i1, i2+1), func(dp, s1, s2, i1+1, i2));
        }

        return dp[i1][i2]; 
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[i].length;j++) {
                dp[i][j] = -1;
            }
        }
        return func(dp, text1, text2, 0, 0);
    }
}
