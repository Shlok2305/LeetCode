class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int left = s.length()-1;
        int right = s.length()-1;
        while(left>=0){
            if(s.charAt(left)==' '){
                for(int i = left+1;i<right+1;i++){
                    sb.append(s.charAt(i));
                }
                sb.append(' ');
                left--;
                right = left;

            }
            else{
                left--;
            }
        }
        // sb.append(' ');
        for(int i = 0;i<right+1;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString().strip().replaceAll("\\s+", " ");
    }
}