class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer ,Integer> map = new HashMap<>();
        int[] ans =new int[2] ;
        for(int i = 0 ; i <  nums.length ;i++){
            int element = target - nums[i] ;
            
            if(map.containsKey(element)){
                ans[0] = i ;
                ans[1] = map.get(element) ;
                return ans ;
            }
            map.put(nums[i] , i) ;
        }
        return ans ;
    }
    
}