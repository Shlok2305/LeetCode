class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                j++;
            } else {
                result = Math.max(result , j);
                j = 0;
            }
        }
        return Math.max(result , j);
    }
}