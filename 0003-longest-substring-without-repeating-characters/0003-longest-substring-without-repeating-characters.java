class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int result = 0 ;
        int left = 0 ;
        int right = 0;

        while (right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                result = Math.max(result,right-left);
            }
            else{
                set.remove(s.charAt(left));
                result = Math.max(result,right-left);
                left++;
            }
        }
        return result;
    }
}