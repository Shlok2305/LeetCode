class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen=0;
        for (int num : nums) {
            set.add(num);
        }
        int current = 0;
        int length = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                current = x;
                length = 1;
            
            while (set.contains(current + 1)) {
                current++;
                length++;
            }
            maxLen = Math.max(length,maxLen);
        }
        }
        return maxLen ;
    }
}