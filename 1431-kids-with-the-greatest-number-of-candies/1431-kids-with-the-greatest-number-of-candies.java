class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
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