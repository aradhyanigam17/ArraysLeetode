class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       
        int max = Integer.MIN_VALUE ;
        
        int maxIndex = -1 ;
        
        for(int i = 0 ; i < arr.length ; i++){
        
            if( max < arr[i] ){
                max = arr[i] ;
                maxIndex = i ;
            
            }
        }
        
        return maxIndex ;
    }
}