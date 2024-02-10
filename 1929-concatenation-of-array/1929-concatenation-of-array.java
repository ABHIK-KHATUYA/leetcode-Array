class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];
        int k = 0;
        for(int i=0;i<2*n;i++){
            ans[i] = nums[k];
            k++;
            if(k==n && i<2*n){
                k=0;
            }
        }
        return ans;
    }
}