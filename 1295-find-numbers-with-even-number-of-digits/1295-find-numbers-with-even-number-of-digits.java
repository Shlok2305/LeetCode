class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i<nums.length;i++){  
            String s = String.valueOf(nums[i]);
            int n = s.length();
            if(n %2==0){
                count++;
            }
        }
        return count;
    }
}