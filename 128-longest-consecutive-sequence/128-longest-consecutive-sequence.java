class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length <= 1) return nums.length ;
            
        Set<Integer> set = new HashSet<>() ;
        
        for(int num : nums) {
            set.add(num) ;
        }
        
        int longestStreak = 0 ;
        
        for(int num : nums){
            if(!set.contains(num - 1)){
                int cur = num ;
                int streak = 1 ;
                
                while(set.contains(cur + 1)){
                    cur += 1 ;
                    streak += 1 ;
                }
                
                longestStreak = Math.max(longestStreak , streak);
            }
        }
        return longestStreak ;
    }
}