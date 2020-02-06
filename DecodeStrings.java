/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
*/


class Solution {
    public String decodeString(String s) {
        if(s.length()==0) return s;
        char[] chs = s.toCharArray();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        
        int count = 0;
        String curr = "";
        for(int i=0;i<chs.length;i++){
            char ch = chs[i];
            if(Character.isDigit(ch)){
                count=count*10+ch-'0';
            }
            else if(ch=='['){
                countStack.push(count);
                count = 0;
                strStack.push(curr);
                curr="";
            }
            else if(ch==']'){
                int countCurr = countStack.pop();
                String prevStr = strStack.pop();
                while(countCurr>0){
                    prevStr+=curr;
                    countCurr--;
                }
                curr = prevStr;
            }
            else
                curr += Character.toString(ch);
        }
        return curr;
    }
}
