import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
    int gas=0;
    for(int i=0;i<nums.length;i++)
    {
        if(gas<i){
            return false;
        }
        gas=Math.max(gas,i+nums[i]);
    }
        return true;
    }
}
