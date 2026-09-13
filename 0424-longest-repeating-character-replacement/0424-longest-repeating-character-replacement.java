class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0 ;
        int right =0;
        int hf = 0 ;
        int result =0;

        while(right<s.length()){
            
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),map.get(s.charAt(right))+1);
            }
            else{
                map.put(s.charAt(right),1);
            }
            hf = Math.max(hf,map.get(s.charAt(right)));
        
            while((right -left + 1) - hf > k){
                char leftMost = s.charAt(left);
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }

}