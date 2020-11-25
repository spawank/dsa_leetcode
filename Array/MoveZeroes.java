// https://leetcode.com/problems/move-zeroes/

// 1st Approach
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int firstZero = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[firstZero] != 0 && firstZero < (nums.length-1)){
                firstZero++;
                }
            if (nums[i] != 0 && i > firstZero){
                nums[firstZero] = nums[i];
                nums[i] = 0;
            }
        }
    }
}

// 2nd Approach
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastZero = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[lastZero];
                nums[lastZero] = nums[i];
                nums[i] = temp;
                lastZero++;
            }
        }
    }
}