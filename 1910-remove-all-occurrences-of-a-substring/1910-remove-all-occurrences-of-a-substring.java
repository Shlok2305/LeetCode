class Solution {
    public String removeOccurrences(String s, String part) {
        int index = 0;
        while(s.contains(part)){
            index = s.indexOf(part);
            s = s.substring(0,index) + s.substring(index + part.length());
        }
        return s;
    }
}