class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length/2;
        int midean = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums.length%2==0){
                midean = (nums[mid - 1] + nums[mid])/2;
            }
            else{
                midean = nums[mid];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            count += Math.abs(nums[i] - midean);
        }
        return count;
    }
}