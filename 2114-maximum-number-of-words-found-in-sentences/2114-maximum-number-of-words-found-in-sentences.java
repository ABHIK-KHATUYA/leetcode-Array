class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0,t=0;
        for(int i=0;i<sentences.length;i++){
            String s = sentences[i];
            t = 1;
            // t = s.split("\\s").length;
            for(int j =0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    t++;
                }
            }
            if(c<t){
                c=t;
            }
        }
        return c;
    }
}