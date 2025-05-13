class Pair{
		int row;
        int col;
    int time;
    Pair(int _row, int _col , int _time){
    		this.row=_row;
        this.col=_col;
        this.time=_time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] vis = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
          		if(grid[i][j]==2){
              		q.offer(new Pair(i,j,0));
                  vis[i][j]=1;
              }
              if(grid[i][j]==1) fresh++;
              
          }
        }
        int t=0;
        int [] drow = {-1,0,1,0};
        int [] dcol = {0,-1,0,1};
        while(!q.isEmpty()){
        		int r = q.peek().row;
            int c = q.peek().col;
            int tm = q.peek().time;
            q.poll();
            t=Math.max(t,tm);
            for(int i=0;i<4;i++){
            		int nrow= r+ drow[i];
                int ncol= c+ dcol[i];
                if(nrow>=0 && nrow<m && ncol >= 0 && ncol <n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                		q.offer(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=1;
                    fresh--;
                }
            }
        }
        if(fresh==0) return t;
        else return -1;
    }
}