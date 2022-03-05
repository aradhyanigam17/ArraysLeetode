class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length ;
        if(n == 1) return nums[0];
        int count = 0 ;
        int c = 0 ;
        
        for(int i = 0 ; i < n - 1 ;i++){
            
           count = 1 ;
            for(int j = i + 1 ;  j < n ; j++){
               
                    if(nums[i] == nums[j]){
                        count++ ;
                    }
                
            }
             
            if(count > n/2) {
                c = nums[i] ;
                break ;
            }
        }
        
                  
        
      return c ;
        
    }
}