/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
*/

class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0){
            int n1 = 0;
            int n2 = 0;
            if(i>=0)
                n1 = num1.charAt(i--)-'0';
            if(j>=0)
                n2 = num2.charAt(j--)-'0';
            int sum = n1+n2+carry;
            carry = sum/10;
            sb.append(sum%10);
        }
            if(carry!=0){
            sb.append(carry);
            
        }
        return sb.reverse().toString();
    }
}
