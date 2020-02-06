/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String current = new String(ch);
            if(map.containsKey(current)){
                map.get(current).add(str);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(current,temp);
            }
        }
            result.addAll(map.values());
            return result;
    }
}
