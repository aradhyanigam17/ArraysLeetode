class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       
        String words1 = "" ;
        String words2 = "" ;
        
        for(int i = 0 ; i < word1.length ; i++){
            words1 = words1 + word1[i] ;
        }
        
        for(int i = 0 ; i < word2.length ; i++){
            words2 = words2 + word2[i] ;
        }
        
        System.out.println(words1);
        System.out.println(words2);
        
        
        return words1.equals(words2) ;
        
    }
}