class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                j++;
                // result = j;
            } else {
                if (result < j) {
                    result = j;
                }
                j = 0;
            }
        }
        // if (result < j) {
        //     result = j;
        // }
        return Math.max(result , j);
    }
}