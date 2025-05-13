class Solution {
		private List<String> ans = new ArrayList<>();
		public void generate(int open , int close , StringBuilder s){
    		if(open ==0 && close == 0){
        		ans.add(s.toString());
            return ;
        }
        if(open > 0 ){
        		s.append('(');
            generate(open -1 ,close , s);
            s.deleteCharAt(s.length() -1);  //backtracking
        }
        if(close >0 && close> open){
        		s.append(')');
            generate(open , close -1 , s);
            s.deleteCharAt(s.length() - 1); //backtracking
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        generate(n,n,s);
        return ans;
    }
}
