class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int total = Arrays.stream(nums).sum();
        for(int i = 0; i<nums.length;i++){
            int right = total -nums[i];
            if(left == right){
                return i;
            }else{
                total -= nums[i];
                left +=nums[i];
            }
        }
        return -1;
    }
}