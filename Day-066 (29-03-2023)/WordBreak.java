class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];

        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<=i;j++) {
                if(j==0 || dp[j-1] == true) {
                    if(wordDict.contains(s.substring(j, i+1))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[dp.length-1];
    }
}
