class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int a=piles.length/3;
        int b=0;
        for(int i=piles.length-2;i>=a;i-=2)
        {
            b+=piles[i];
        }
        return b;
    }
}