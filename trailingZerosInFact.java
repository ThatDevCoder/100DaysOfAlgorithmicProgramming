/*
A single integer N.

Constraints
1 <= N <= 10^9

Output Format
A single integer denoting the count of trailing zeroes in N!

Sample Input
5
Sample Output
1
Explanation
Factorial of 5 is 120 which has one trailing 0.
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double n = input.nextInt();
		double sum = 1;
		int power = 1;
		int total = 0;
		while(sum!=0){
			double k = n/(Math.pow(5,power));
			// k = (double)k;
			power++;
			sum = Math.floor(k);
			total+=sum;
		}
		System.out.println(total);
    }
}
