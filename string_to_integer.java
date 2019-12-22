/*
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

        Example 1:

        Input: "42"
        Output: 42
        
        Example 3:

        Input: "4193 with words"
        Output: 4193
        Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
*/

My Solution:
    Time Complexity :- O(N)
    As we are visiting every element in a string only once
 
 BONUS (VERY IMPORTANT)
 I have used horner's rule (PLEASE GOOGLE ABOUT IT BELIEVE ME IT'S WORTH IT)
 
 
 MY CODE(I know its messy i'll imporve code readability for sure) :-
 
 class Solution {
    public int myAtoi(String str) {
        if(str==null || str.length()==0) return 0;
        int sign =1 , i =0 ,n = str.length();
        while(i<n&&str.charAt(i)==' ')
                ++i;
        if(i>=n)
            return 0;
        if(str.charAt(i)=='+'||str.charAt(i)=='+')
            sign = str.charAt(i++)=='+'?1:-1;
       // i++;
        long result=0;
        while(i<n&&Character.isDigit(str.charAt(i)))
        {

          result = (result*10)  + str.charAt(i++)-'0';    //HORNER'S RULE USED
            //i++;
        if(result*sign>Integer.MAX_VALUE&&result*sign<Integer.MIN_VALUE)
            return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return (int)(result*sign);
    }
}
 
