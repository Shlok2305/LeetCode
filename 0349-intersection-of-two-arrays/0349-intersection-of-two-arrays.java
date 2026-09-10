class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> answer = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : nums1) {
            set1.add(x);
        }
        for(int x : nums2){
            if(set1.contains(x)&& !answer.contains(x)){
                result.add(x);
                answer.add(x);
            }
        }
        int [] ans = new int[result.size()];
        for(int i = 0;i<ans.length;i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}