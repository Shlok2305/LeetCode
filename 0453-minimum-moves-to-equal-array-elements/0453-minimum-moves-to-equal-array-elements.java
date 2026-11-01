class Solution {
    public int minMoves(int[] nums) {
        int min =nums[0];
        int sum = 0;
        int n = nums.length;

        for(int num : nums){
            min = Math.min(min,num);
            sum += num;
        }
        return sum - (n * min);
    }
}