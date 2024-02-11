class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i=0;i<accounts.length;i++){
            int s = 0;
            for(int j =0;j<accounts[i].length;j++){
                s = s + accounts[i][j];
            }
            if(ans<s){
                ans = s;
            }
        }
        return ans;
    }
}