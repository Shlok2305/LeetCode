class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i = 0 ; i< sentences.length;i++){
            int spaces = 0;
            String n = sentences[i];
            for(int j = 0;j<n.length();j++){
                if(n.charAt(j)==' '){
                    spaces++;
                }
            }
            if(spaces>count){
                count = spaces;
            }
        }
        return count+1;
    }
}