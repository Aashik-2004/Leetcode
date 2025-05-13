class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] a=new int[m][n];
        for(int[] row: a)
        Arrays.fill(row,-1);
        a[0][0]=grid[0][0];
        for(int i=1;i<m;i++)
        a[i][0]=grid[i][0]+a[i-1][0];
        for(int i=1;i<n;i++)
        a[0][i]=grid[0][i]+a[0][i-1];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int c=Math.min(a[i-1][j],a[i][j-1]);
                a[i][j]=c+grid[i][j];
            }
        }
        return a[m-1][n-1];
        
    }
}
