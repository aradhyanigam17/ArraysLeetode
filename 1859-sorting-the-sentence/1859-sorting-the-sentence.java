class Solution {
    public String sortSentence(String s) {
        String[] strArray = s.split(" ");
        
        String[] strContain = new String [strArray.length];
        String out = "" ;
        
       // System.out.println(strContain[0]) ; // shows null
            for(int i = 0 ; i < strArray.length ; i++){
                StringBuilder str = new StringBuilder();

                int a = 0 ; 
                String element = strArray[i] ;
                // System.out.println(element.length()) ;
                
                for(int j = 0 ; j < element.length() ; j++){
                    
                    if(!( (int)element.charAt(j) >= 65 && (int)strArray[i].charAt(j) <= 122)) {
                                            a = Character.getNumericValue(strArray[i].charAt(j)) ;

                        
                    }
                    else {
                        str.append(element.charAt(j)) ;
                    }
          
                }
                
                strContain[a - 1] = str.toString() ;
                
            }
                
        for(int i = 0 ; i < strContain.length; i++){
           
            if(i == strContain.length - 1) out = out + strContain[i] ;
            else out = out + strContain[i] + " ";
        
        }
        return out ;
        
    }
    
    
}