class Solution {
    public void rotate(int[][] mat) {
        transpose(mat);
        reverse(mat);
        
    }
    
    // transposing
    public void transpose(int[][] mat){
        for(int i = 0 ;i < mat.length ; i++){
            for(int j = i ; j < mat[0].length ;j++){
                
                swap(mat , i , j) ; 
                
            }
        }
    }
    
    public void reverse(int[][] mat){
            for(int i = 0 ; i < mat.length ; i++){ 
                int j = 0 ;
                int k = mat.length -1 ;
                while(j < k){
                    swap(mat[i] , j , k);
                    j++;
                    k--;
                }
            }
    }
    
    public void swap(int[][] mat , int i , int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp ;
     }
    
    public void swap(int[] mat , int i , int j){
        int temp = mat[i];
        mat[i] = mat[j];
        mat[j] = temp ;
     }
}