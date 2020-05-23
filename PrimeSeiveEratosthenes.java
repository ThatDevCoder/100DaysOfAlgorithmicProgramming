// TO FIND THE PRIMES IN LESS TIME COMPLEXITY VErY VErY IMP

import java.util.*;
import java.lang.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean primes[] = new boolean[n+1];
        Arrays.fill(primes,true);
        
        for(int i=2; i*i <=n ;i++){
            if(primes[i]==true){
                for(int j=i*2;j<=n; j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i]==true){
                System.out.println(i);
            }
        }
     }
}
