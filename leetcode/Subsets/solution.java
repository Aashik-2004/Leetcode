class Solution {
		private List<List<Integer>> ans = new ArrayList<>();
		public void generate( int i , int [] nums , List<Integer> a){
    		if(i==nums.length){
        		ans.add(new ArrayList<>(a));
            return ;
        }
        generate(i+1,nums,a);  //notpick
        a.add(nums[i]);   //pick
        generate(i+1,nums,a);
        a.remove(a.size()-1);  //backtracking
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> a = new ArrayList<>();
        generate(0,nums,a);
        return ans;
    }
}