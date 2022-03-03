class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        
        List<Integer> pre = new ArrayList<>();
        List<Integer> row = null ;
        
        for(int i = 0 ; i < numRows ; ++i){
        row = new ArrayList<>();
            
            for(int j = 0 ; j <= i ;j++){
                if(j == 0 || j == i ){
                    row.add(1);
                }
                
                else{
                    row.add( pre.get(j - 1) + pre.get(j) ) ;
                }
            }
            
            pre = row ;
            list.add(row) ;
        }
        return list  ;
    }
}