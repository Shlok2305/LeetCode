class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = n+m-1;
        int i = m-1;
        int j = n-1;
        while(j>=0 && i>=0){
            if(nums1[i]<=nums2[j]){
                nums1[index] = nums2[j];
                index--;
                j--;
            }
            else if(nums1[i]>=nums2[j]){
                nums1[index] = nums1[i];
                index--;
                i--;
            }
        }
        while(j>=0){
            nums1[index]= nums2[j];
            index--;
            j--;
        }
    }
}