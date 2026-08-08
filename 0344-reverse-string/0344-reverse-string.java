class Solution {
    public void reverseString(char[] s) {
        for (int i = 0;i<s.length/2;i++){
            char right =s[ s.length - i -1];
            char left = s[i];

            s[i] = right;
            s[s.length-i-1] = left;
        }
    }
}