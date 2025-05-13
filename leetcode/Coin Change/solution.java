class Solution {
		public static int solve(int [] coins , int n , int amount,int [][] dp){
    		if(n==0){
        		if(amount%coins[n]==0) return amount/coins[n];
            else return Integer.MAX_VALUE-1;
        }
        if(dp[n][amount]!=-1) return dp[n][amount];
        int notpick = solve(coins,n-1,amount,dp);
        int pick = Integer.MAX_VALUE-1;
        if(	amount >= coins[n]){
    				pick = 1+ solve(coins,n,amount-coins[n],dp);
        }
 				return dp[n][amount] =  Math.min(pick,notpick);
        
    }
    public int coinChange(int[] coins, int amount) {
				int n= coins.length;
        int dp [][] = new int[n][amount+1];
        for(int [] row : dp){
        		Arrays.fill(row,-1);
        }
       	int ans = solve(coins,n-1,amount,dp); 
        if(ans==Integer.MAX_VALUE-1) return -1;
        return ans;
    }
}
