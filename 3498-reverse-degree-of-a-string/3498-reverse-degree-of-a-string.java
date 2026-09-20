class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int revInd =26 - (s.charAt(i)-'a');
            sum += (i+1)* revInd;
        }
        return sum;
    }
}