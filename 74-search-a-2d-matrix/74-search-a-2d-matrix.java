class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length ;
        int n = mat[0].length ;
        
        for(int i = 0 ; i < m ;i++){
            for(int j = 0 ; j < n; j++){
                if(mat[i][j] == target) return true; 
            }
        }
        return false ;
    }
}