/*
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
*/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        char s[] = S.toCharArray();
        char t[] = T.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        for(char c:s){
            if(c!='#'){
                sb.append(c);
            } else if(c=='#' && sb.length()!=0){
                sb.deleteCharAt(sb.length() - 1);
            } else if(c=='#' && sb.length()==0){
                continue;
            }
        }
         for(char c:t){
            if(c!='#'){
                st.append(c);
            } else if(c=='#' && st.length()!=0){
                st.deleteCharAt(st.length() - 1);
            } else if(c=='#' && st.length()==0){
                continue;
            }
        }
        return sb.toString().equals(st.toString());
    }
}
