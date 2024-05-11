class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = 0;
        int f =0;
        int l = k,j=0;
        while(l<=blocks.length()){
            String str = blocks.substring(j,l);
            
            j++;
            l++;
            int count = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='W'){
                   
                    count++;
                }
            }
            if(f==0){
                f++;
                min = count;
            }
            if(count==0){
                min=count;
                break;
            }
            else if(min>count){
                min =count;
            }
        }
        return min;
    }
}