class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int low=1;int high=x;int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                result=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
}
