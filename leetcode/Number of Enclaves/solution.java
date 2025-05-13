class Pair{
		int row;
    int col;
    Pair(int _row , int _col){
    		this.row=_row;
        this.col=_col;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] vis = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0; i<m;i++){
        		if(grid[i][0]==1){
            		vis[i][0]=1;
                q.offer(new Pair(i,0));
            }
            if(grid[i][n-1]==1){
            		vis[i][n-1]=1; 
                q.offer(new Pair(i,n-1));
            }
        }
        for(int i=0;i<n;i++){
        		if(grid[0][i]==1){
            		vis[0][i]=1;
                q.offer(new Pair(0,i));
            }
            if(grid[m-1][i]==1){
            		vis[m-1][i]=1;
                q.offer(new Pair(m-1,i));
            }
        }
        int [] drow = {-1,0,1,0};
        int [] dcol = {0,1,0,-1};
        while(!q.isEmpty()){
        		int r=q.peek().row;
            int c=q.peek().col;
            q.poll();
            for(int i=0;i<4;i++){
            		int nrow = r+drow[i];
                int ncol =  c+dcol[i];
                if(nrow>=0 && nrow<m && ncol >=0 && ncol <n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1 ){
                			vis[nrow][ncol] =1;
                      q.offer(new Pair(nrow,ncol));
                }
            }
        }
				int count=0;
        for(int i=0;i<m;i++){
        		for(int j=0;j<n;j++){
            		if(grid[i][j]==1 && vis[i][j]==0){
                		count+=1;
                }
            }
        }
        return count;
    }
}