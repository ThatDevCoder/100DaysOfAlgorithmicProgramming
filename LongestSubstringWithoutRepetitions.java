/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
*/

//SLIDING WINDOW PROBLEM

class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s.length()==0) return 0;
     Set<Character> set = new HashSet<Character>();
        int a_pointer=0;
        int b_pointer=0;
        int max = 0;
        while(b_pointer<s.length()){
            if(!set.contains(s.charAt(b_pointer))){
                set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(set.size(),max);
            }
            else
            {set.remove(s.charAt(a_pointer));
                a_pointer++;}
        }
        return max;
    }
}
