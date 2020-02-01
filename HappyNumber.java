/*
Write an algorithm to determine if a number is "happy".

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<Integer>();
        while(n!=1&&!seen.contains(n))
        {
            seen.add(n);
            n = helper(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    private int helper(int n){
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum += (rem*rem);
            n=n/10;
        }
        return sum;
    }
        
}
