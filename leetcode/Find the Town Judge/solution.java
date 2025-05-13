class Solution {
    public int findJudge(int n, int[][] trust) {
        int indegree [] = new int[n+1];
        int outdegree [] = new int[n+1];
        for(int i=0;i<trust.length;i++){
        		int ai=trust[i][0];
                int bi=trust[i][1];
        		outdegree[ai]+=1;
            indegree[bi]+=1;
        }
        for(int i=1;i<n+1;i++){
        		if(outdegree[i]==0 && indegree[i]==n-1) return i;
        }
        return -1;
    }
}