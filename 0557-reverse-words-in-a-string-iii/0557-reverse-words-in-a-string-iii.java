class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        // int right = i - 1;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == ' ') {
                int right = i - 1;
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
                
            }
        }
        int right =s.length()-1;
        while(left<right){
            char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
        }

        return new String(arr);
    }
}