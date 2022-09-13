class Solution {
    public int countOdds(int low, int high) {
        int countOdds = 0;
        if (low%2 == 1 || high%2==1){
             countOdds = (high-low)/2 + 1 ;
        }
        else if (low%2 == 0 || high %2==0){
            countOdds = (high-low)/2 ;
        }
        return countOdds;
            
        
    }
}