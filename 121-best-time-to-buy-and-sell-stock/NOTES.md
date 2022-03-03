```
class Solution {
public int maxProfit(int[] prices) {
if(prices.length == 1) return 0 ;
int min = prices[0] ;
int indexMin = 0 ;
for(int i = 0 ; i < prices.length ;i++){
if(min > prices[i]) {
min = prices[i] ;
indexMin = i ;
}
}
int max = 0 ;
for(int j = indexMin ; j < prices.length ;j++ ){
if(max < prices[j]){
max = prices[j];
}
}
int profit = max - min ;
return profit ;
}
}
```