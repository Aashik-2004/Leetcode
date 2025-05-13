class Solution {
    public int longestPalindromeSubseq(String s) {
        String p = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int dp[] = new int[m+1];
        int de[] = new int[m+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1) == p.charAt(j-1))
                {
                    dp[j] = 1 + de[j-1];
                }
                else
                {
                    dp[j] = Math.max(dp[j-1] , de[j]);
                }
            }
            for(int j=1;j<=m;j++)
            {
                de[j] = dp[j];
            }
        }
        return de[m];
    }
}
