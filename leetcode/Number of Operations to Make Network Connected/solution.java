class Solution {
    public int makeConnected(int n, int[][] connections) {
        int[] parent = new int[n];
        int[] rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }

        int extraEdges=0;
        int req=0;
        for(int i=0;i<connections.length;i++){
            int ulpsrc=findParent(connections[i][0],parent);
            int ulpdst = findParent(connections[i][1],parent);
            if(ulpsrc == ulpdst) extraEdges++;
            else
            {
                union(ulpsrc,ulpdst,parent,rank);
            }
        }
        
        for(int i=0;i<n;i++){
            if(parent[i]==i) req++;
        }
        int ans = req-1;
        if(ans<=extraEdges) return ans;
        return -1;
    }
    public int findParent(int node,int[] parent)
    {
        if(parent[node]==node) return node;
        return parent[node]=findParent(parent[node],parent);
    }

    public void union(int u,int v,int[] parent,int[] rank)
    {
        int pu = findParent(u,parent);
        int pv = findParent(v,parent);
        if(rank[pu]<rank[pv]){
            parent[pu]=pv;
        }
        else if(rank[pv]<rank[pu]){
            parent[pv] = pu;
        }
        else{
            parent[pv]=pu;
            rank[pu]++;
            }
    }
}