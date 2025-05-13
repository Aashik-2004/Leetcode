import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
       int a=Arrays.binarySearch(nums,target);
       if(a<0)
       {
        return -1;

       }
       else
       {
        return a;
       }
    }
}