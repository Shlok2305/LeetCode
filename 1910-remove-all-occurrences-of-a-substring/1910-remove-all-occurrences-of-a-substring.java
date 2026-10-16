class Solution {
    public String removeOccurrences(String s, String part) {
        int index = 0;
        while((index = s.indexOf(part)) !=-1){
            index = s.indexOf(part);
            s = s.substring(0,index) + s.substring(index + part.length());
        }
        return s;
    }
}