class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] inDegree = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(int it : adj.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int a:adj.get(node)){
                inDegree[a]--;
                if(inDegree[a]==0) q.add(a);
            }
        }
        if(count==numCourses) return true;
        return false;
    }
}
