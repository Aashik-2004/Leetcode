class Solution {
		public static int solve(String text1 , String text2 , int i , int j,int [][] dp){
    		if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)){
        		return dp[i][j]= 1+solve(text1,text2,i-1,j-1,dp);
        }
        else{
        		return dp[i][j] = Math.max(solve(text1,text2,i-1,j,dp),solve(text1,text2,i,j-1,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int dp [][] = new int[n1][n2];
        for(int [] row : dp){
        		Arrays.fill(row,-1);
        }
        return solve(text1,text2,n1-1,n2-1,dp);
        
    }
}