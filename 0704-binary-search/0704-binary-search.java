class Solution {
    public int search(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length -1;
        int mid = (nums.length-1)/2;

        while(start<=end){
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid]<target){
            start = mid + 1;
            mid = start + (end - start) /2;
        }
        else{
            end = mid-1;
            mid = start + (end - start) /2;
        }
        }
        return -1 ;
    }
}