class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                arr[j] = nums[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
        
    }
} 
