class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k = n;
        int c =0;
        int ans[] = new int[2*n];
        for(int i=0;i<2*n;i+=2){
            ans[i] = nums[c];
            ans[i+1] = nums[k];
            k++;
            c++;
        }
        return ans;
    }
}