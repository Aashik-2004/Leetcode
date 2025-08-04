public class Solution {
    public boolean isPalindrome(int x) {
        int r = 0, rem;
        int o = x;
        if (x < 0) {
            return false;
        }

        while (x != 0) {
            rem = x % 10;
            r = r * 10 + rem;
            x = x / 10;
        }

        return o == r;
    }
}
