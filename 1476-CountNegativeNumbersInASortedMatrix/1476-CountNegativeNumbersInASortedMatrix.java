// Last updated: 7/14/2026, 2:02:59 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] <1 && grid[i][j]!=0){
                   count++;
                  
                }
            }
        }
        return count;
    }
}