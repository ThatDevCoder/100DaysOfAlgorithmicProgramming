/*
Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences.  If multiple answers exist, you may return any of them.

(A string S is a subsequence of string T if deleting some number of characters from T (possibly 0, and the characters are chosen anywhere from T) results in the string S.)
      Example 1:

      Input: str1 = "abac", str2 = "cab"
      Output: "cabac"
      Explanation: 
      str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
      str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
      The answer provided is the shortest such string that satisfies these properties.
*/

class Solution {
    public String shortestCommonSupersequence(String X, String Y) {
        int n = X.length();
        int m = Y.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i=0; i<=n;i++){
            for(int j=0; j<=m; j++){
                if(n==0 || m==0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m; j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = n, j=m;
        while(i>0 && j>0){
            if(X.charAt(i-1) == Y.charAt(j-1)){
                sb.append(X.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(dp[i][j-1] > dp[i-1][j] ) {
                    sb.append(Y.charAt(j - 1));
                    j--;
                }
                else {
                    sb.append(X.charAt(i-1));
                    i--;
                }
            }

        }
        while (i>0){
            sb.append(X.charAt(i-1));
            i--;
        }
        while (j>0){
            sb.append(Y.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
}
