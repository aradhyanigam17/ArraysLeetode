class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
       int m = mat.length ;
        int n = mat[0].length ;
        
        int row = 0 ; 
        int col = n - 1;
        
        while(row < m && col >= 0){
            if(mat[row][col] == target) return true;
            
            else if(mat[row][col] < target){
                row++ ;
            }
            else col-- ;
        }
        
        return false ;
    }
}