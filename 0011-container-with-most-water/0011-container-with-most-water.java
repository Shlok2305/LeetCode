class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length -1;

        while(left < right){
            int water = 0;
            if(height[left] > height[right]){
                water = height[right]*(right - left);
                right--;
            }
            else if(height[left] == height[right]){
                water = height[right]*(right - left);
                right--;
                left++;
            }
            else{
                water = height[left]*(right - left);
                left++;
            }

            if(water > result){
                result = water;
            }
        }
        return result;
    }
}