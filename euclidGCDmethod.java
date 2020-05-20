/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the GCD of N1 and N2. Print the value returned.

Input Format
Two integers seperated by a new line.

Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000

Output Format
Output a single integer which is the GCD of the given integers.

Sample Input
16 
24
Sample Output
8


*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		b = in.nextInt();
		int gcd = GCD(a,b);
		System.out.println(gcd);

    }
	public static int GCD(int a,int b){
		return b==0?a : GCD(b,a%b);
	}
}
