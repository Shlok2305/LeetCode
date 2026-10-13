class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long score =0;
        long[] ans = new long[n];
        for(int i=0;i<nums.length;i++){
            long sqr = nums[i]*nums[i];
            ans[i] = sqr;
        }
        Arrays.sort(ans);
        for(int i=0;i<n/2;i++){
            score =score - ans[i];
        }
        for(int i =n/2;i<nums.length;i++){
            score = score + ans[i];
        }
        return score;
    }
}