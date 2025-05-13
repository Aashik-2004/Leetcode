class Solution {
    public int findCenter(int[][] edges) {
        int k=0;
                if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] )
                    k = edges[0][0];
                else if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1] )
                    k = edges[0][1];
        return k;
    }
}