class Solution {
    public int longestPalindrome(String s) {
        int result=0;
        int j = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            } 
        }
        for(int num:map.values()){
            if(num%2==0){
                result+= num;
            }
            else{
                result += num-1;
                j++;
            }
        }
        if(j>0){
            result +=1;
        }
        return result;
        
    }
}