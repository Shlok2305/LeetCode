class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        int sum = 0;

        for(int i = 0;i<k;i++){
            sum += nums[i];
        }
        maxAvg = sum;
        int left = 0 ;
        for(int i = k ;i<nums.length;i++){
            sum -= nums[left];
            left++;
            sum += nums[i];

            maxAvg = Math.max(maxAvg,sum);
            
        }
        return maxAvg/k;
    }
}