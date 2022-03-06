class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0 ;
       
        for(int i = 0 ; i < s.length() ;i++){
            
            ArrayList<Character> list = new ArrayList<>();
            
            for(int j = i ; j < s.length(); j++){
                  
                if(!list.contains(s.charAt(j))){
                      list.add(s.charAt(j)) ;
                }
                 else{
                     break ;
                 }
            
            }
            
            max = Math.max(list.size() , max);
            
        }
        return max ;
    }
}