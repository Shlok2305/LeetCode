class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum / k;

        for(int i =k;i<nums.length;i++){
            sum -= nums[i-k];
            sum += nums[i];

            max = (double)Math.max(max,sum/k);
        }
        return max;
    }
}