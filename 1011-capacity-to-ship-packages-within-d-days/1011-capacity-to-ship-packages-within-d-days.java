class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum =0,maxW =0; 
        for(int i=0;i<weights.length;i++){
            if(maxW<weights[i]){
                maxW = weights[i];
            }
            sum += weights[i];
        }
        int l = maxW,h=sum,m=0,a=0;
        while(l<=h){
            m = l+(h-l)/2;
            int ans = cal(weights,m);
            if(ans<=days){
                a=m;
                h=m-1;
            }
            else if(ans>days){
                l=m+1;
            }
        }
        return a;
    }
    public static int cal(int w[],int cap){
        int d=1,load=0;       
        for(int i=0;i<w.length;i++){  
            if(load+w[i] > cap){
                d++;
                load = w[i];
            }else{
                load += w[i];
            }
        }
        return d;
    }
}