// https://leetcode.com/problems/palindrome-number/

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int length = (int)(Math.log10(x) + 1);
        int s = 1, e = length;
        int startV, endV; 
        if (x < 0) return false;
        while(s < e) {
          startV = (int)((x/Math.pow(10, s-1)) % 10);
          endV   = (int)((x/Math.pow(10, e-1)) % 10);
          if (startV != endV) return false;
          s ++; e--;
        }
        return true;
    }
}