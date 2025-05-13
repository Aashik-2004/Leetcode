class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=1;i<=9;i++)
        {
            q.add(i);
        } 
        for(int j=1;j<n;j++)
        {
            int size = q.size();
            for(int e=0;e<size;e++)
            {
                Integer x = q.poll();
                int f= x%10;
                if(f+k <=9)
                {
                    Integer g=(x*10)+(f+k);
                    q.add(g);
                }
                if(f-k >= 0 && k != 0)
                {
                    Integer g=(x*10)+(f-k);
                    q.add(g);
                }
            }
        }
        int[] arr=new int[q.size()];
        int index=0;
        while(!q.isEmpty())
        {
            arr[index++]=q.poll();
        }
        return arr;
    }
}
