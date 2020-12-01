// https://leetcode.com/problems/power-of-three/


// Approach 1
// class Solution {
//     public boolean isPowerOfThree(int n) {
//         int i = 0;
//         while(Math.pow(3, i) <= n) {
//             if (Math.pow(3, i) == n) return true;
//             i++;
//         }
//         return false;
//     }
// }



// Approach 2
// n = 3 ^ i
// i = log3(n) //power of 3 
// Integer.MAX_VALUE = 2147483647
// max power is 19 =>
// log3(2147483647) = 19.56
class Solution {
    public boolean isPowerOfThree(int n) {
        return (n > 0) && (Math.pow(3, 19) % n == 0);
    }
}