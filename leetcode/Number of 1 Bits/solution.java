class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            if((n&1)==1)
                c++;
                n=n>>1;
        }
        return c;
    }
}

