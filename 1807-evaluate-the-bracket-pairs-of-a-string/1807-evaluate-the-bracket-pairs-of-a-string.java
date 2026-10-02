class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();
        StringBuilder key = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();

        for(List<String> pair : knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        int left =0;
        while(left<s.length()){
            if(s.charAt(left)=='('){
                left++;
                while(s.charAt(left) != ')'){
                    key.append(s.charAt(left));
                    left++;
                }
                if(map.containsKey(key.toString())){
                    left++;
                    ans.append(map.get(key.toString()));
                }
                else{
                    left++;
                    ans.append('?');
                }
                key.setLength(0);

            }
            else{
                ans.append(s.charAt(left));
                left++;
            }
        }
        return new String(ans);
    }
}