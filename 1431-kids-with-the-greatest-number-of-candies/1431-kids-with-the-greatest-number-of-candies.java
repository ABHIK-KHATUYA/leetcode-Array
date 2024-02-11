class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>(); 
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies) < max){
                ans.add(false); 
            }
            else{
                ans.add(true);             
            }
        }
        return ans;
    }
}