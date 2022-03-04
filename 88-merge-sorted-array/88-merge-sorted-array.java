class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < nums2.length ; i++){
            nums1[m + i] = nums2[i];
        }
        
        // System.out.println(Arrays.toString(nums1)) ;
        // Arrays.sort(nums1) ;
        
        for(int i = 0 ; i < nums1.length - 1 ;i++){
            for(int j = i ; j >= 0 ; j--){
                if(nums1[j] > nums1[j+1]){
                    swap(nums1 , j , j + 1) ;
                }
            }
        }
        
        
        
        
    }
    
    public void swap(int[] arr ,int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}