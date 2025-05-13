class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[58];
        int len = 0;
        for(char ch: s.toCharArray()) freq[ch-'A']++;

        for(int num: freq) {
            if(num%2 == 0) {
                len+=num;
            } else {
                len += (num-1);
            }
        }

        return len==s.length()?len:len+1;
    }
}