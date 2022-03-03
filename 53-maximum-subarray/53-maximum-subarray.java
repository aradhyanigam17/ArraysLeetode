class Solution {
    public int maxSubArray(int[] nums) {
        
         
        int sum = 0 ;
        int max = nums[0] ; 
        
        for(int i = 0 ; i < nums.length ;i++){
            sum = Math.max(nums[i] , sum + nums[i]); 
            max = Math.max(sum , max);
            
        }
        return max ;
    }
}