//https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/prateek-and-theories-3/

import java.io.*;
import java.util.*;


class TestClass { 
    public static void main(String args[]){
        FastReader in = new FastReader();
        int t = in.nextInt();
        for(int l=0;l<t;l++){
            int n = in.nextInt();
            Map<Integer, Integer> map = new TreeMap<>();
            for(int i=0;i<n;i++){
                int x = in.nextInt();
				int y = in.nextInt();
				map.put(x, map.getOrDefault(x, 0) + 1);
				map.put(y, map.getOrDefault(y, 0) - 1);
            }
            int max = 0, ans = 0;
			for (int val : map.values()) {
				ans += val;
				max = Math.max(max, ans);
			}
            System.out.println(max);
        }
    }
}
class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 
 
    public FastReader() 
    { 
        br = new BufferedReader(new
                    InputStreamReader(System.in)); 
    } 
 
    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
 
    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 
 
    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 
 
    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 
 
    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 
