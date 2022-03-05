class Solution{
    public boolean searchMatrix(int[][] mat, int target){
        int m = mat.length ;
        int n = mat[0].length ;
        int row = 0 ; 
        int col = n - 1;
        
            while(row < m && col >=0){
                
                if(mat[row][col] == target) {
                    return true;
                }
                else if(mat[row][col] < target){
                    row++ ;
                }
                else col-- ;
            }
        
        return false ;
        
    }
}

/*
class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length ;
        int n = mat[0].length ;
        
        for(int i = 0 ; i < m ;i++){
            if(mat[i][0] <= target && mat[i][n-1] >= target){
                for(int j = 0 ; j < n; j++){
                    if(mat[i][j] == target) return true; 
                }
            }
        }
        return false ;
    }
}
*/