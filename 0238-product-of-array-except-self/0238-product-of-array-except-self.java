class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int lp = 1;
        int rp =1;
        int [] ans = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            left[i] = lp;
            lp *= nums[i];
        }
        for(int i =nums.length-1;i>=0;i--){
            right[i] = rp;
            rp *=nums[i];
        }
        for(int i =0 ;i<nums.length;i++){
            ans[i]= left[i]*right[i];
        }
        return ans;
    }
}