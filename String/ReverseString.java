// https://leetcode.com/problems/reverse-string/

class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        int n,start,last;
        n = s.length;
        start = 0; last = n-1;
        while(start < last){
            temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            start++;
            last--;
        }
    }
}