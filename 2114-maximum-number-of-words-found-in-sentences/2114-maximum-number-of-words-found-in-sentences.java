class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0,t=0;
        for(int i=0;i<sentences.length;i++){
            String s = sentences[i];
            t = s.split("\\s").length;
            if(c<t){
                c=t;
            }
        }
        return c;
    }
}