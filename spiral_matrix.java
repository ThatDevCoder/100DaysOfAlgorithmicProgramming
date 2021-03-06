// Program Statement :-
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example 1:

// Input:
        [
         [ 1, 2, 3 ],
         [ 4, 5, 6 ],
         [ 7, 8, 9 ]
        ]
//        Output: [1,2,3,6,9,8,7,4,5]

My approach :-
 Time Complexity :- O(n)


Solution:- 


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        if(matrix.length ==0) return answer;
        int r1 = 0,r2 = matrix.length-1;
        int c1 = 0,c2 = matrix[0].length-1;
        while(r1<= r2 && c1  <= c2)
        {
            for(int c = c1;c<=c2;c++)
                answer.add(matrix[r1][c]);
            for(int r = r1+1; r<=r2;r++)
                answer.add(matrix[r][c2]);
            if(r1<r2 && c1<c2)
            {for(int c = c2-1;c>=c1;c--)
                answer.add(matrix[r2][c]);
            for(int r = r2-1;r>r1;r--)
                answer.add(matrix[r][c1]);}
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return answer;
        
    }
}
