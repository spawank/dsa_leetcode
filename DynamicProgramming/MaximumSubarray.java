
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
      int n = nums.length;
      int max = nums[0];
      int[] maxCount = new int[n];
      maxCount[0] = nums[0];
      for(int i=1; i<n; i++) {
          if((maxCount[i-1] + nums[i]) > nums[i]){
              maxCount[i] = maxCount[i-1] + nums[i];
          } else {
              maxCount[i] = nums[i];
          }
          if (max < maxCount[i]) {
              max = maxCount[i];
          }
      }
      return max;
    }
}