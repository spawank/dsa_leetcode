class Solution {
    public int removeDuplicates(int[] nums) {
       int j =1;
       int n = nums.length;
       if (n == 0) return 0;
       for (int i=1; i< n; i++) {
           if (nums[i] != nums[i-1]){
               nums[j] = nums[i];
               j++;
           }
       }
       return j;
}