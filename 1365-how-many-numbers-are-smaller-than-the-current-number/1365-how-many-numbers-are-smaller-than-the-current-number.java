class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c=0;
        int t=0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            t = nums[i];
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j]){
                    c++;
                }
            }
            arr[i] = c;
            c=0;
        }
        return arr;
    }
}