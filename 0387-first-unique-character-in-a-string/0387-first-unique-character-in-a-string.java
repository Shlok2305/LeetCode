class Solution {
    public int firstUniqChar(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int res = map.get(s.charAt(i));
            if (res == 1) {
                return i ;
            }
        }
        return -1;
    }
}