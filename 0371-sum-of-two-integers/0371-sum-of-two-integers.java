class Solution {
    public int getSum(int a, int b) {
        int temp,carry;
        while (b!=0){
          temp = (a^b);
          carry = (a&b) <<1;
          a = temp;
          b = carry;  
        }return a;
       
    }
}