class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products);
//         for(int i=1;i<searchWord.length();i++){
//             String str2 = searchWord.substring(0,i);
//             int l=0,h=products.length-1;
//             while(l<=h){
//                 int m = l+(h-l)/2;
//                 boolean res = match(products[m],str2);
//                 System.out.println(res+" "+products[m]);
//                 if(res){
//                     h=m-1;
//                 }
//                 else{
//                     l=m+1;
//                 }
//             }
//             int j=l;
//             List<String> st1 = new ArrayList<>();
//             while(j<products.length && j<l+3){
//                 String ts = products[j].substring(0,i);
                
//                 if(ts.equals(str2)){
//                     st1.add(products[j]);
//                 }
//             }
//             System.out.println(st1);
//             ans.add(st1);
//         }
        
        for(int i=1;i<=searchWord.length();i++){
            String ts = searchWord.substring(0,i);
            int j=0,c=0;
             List<String> st1 = new ArrayList<>();
            while(j<products.length && c<3){
                if(products[j].length()>=ts.length()){
                    String ts1 = products[j].substring(0,i);
                if(ts.equals(ts1)){
                    c++;
                    st1.add(products[j]);
                }
                }
                
                j++;
            }
           
            ans.add(st1);
        }
        
        return ans;
        
    }
    // public static boolean match(String product, String s){
    //     if(product.substring(0,s.length()).equals(s)){
    //         return true;
    //     }
    //     return false;
    // }
}