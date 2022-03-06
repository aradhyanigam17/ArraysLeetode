class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2] ;
        boolean done =false ;
       for(int i = 0 ; i < nums.length - 1 ; i++){
           int element = target - nums[i] ;
           for(int j = i + 1   ; j < nums.length ; j++){
               if(nums[j] == element){
                   ans[0] = i ;
                   ans[1] = j ;
                   done = true; 
                   break;
               }
               if(done) break ;
            }
       }
        return ans ;
    }
}