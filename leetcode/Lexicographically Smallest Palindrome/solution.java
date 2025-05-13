class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<= j) {
            if(ch[i] != ch[j]) {
                if(ch[j] > ch[i]) {
                    ch[j] = ch[i];
                } else {
                    ch[i] = ch[j];
                }
            }
            i++;
            j--;
        }  
        return String.valueOf(ch);
    }
}
