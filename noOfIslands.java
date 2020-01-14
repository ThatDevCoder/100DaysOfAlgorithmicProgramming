/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

          Example 1:

          Input:
          11110
          11010
          11000
          00000

          Output: 1
*/

Time Comlexity:- O(M * N)

Code:-

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int noOfIslands = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                noOfIslands+=islands(grid,i,j);}
            }
        }
        return noOfIslands;
    }
    public int islands(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
            return 0;
        }
        grid[i][j]='0';
        islands(grid,i-1,j);
        islands(grid,i+1,j);
        islands(grid,i,j-1);
        islands(grid,i,j+1);
        return 1;
    }
}
