class Solution {
    public String removeDuplicates(String s, int k) {
            StringBuilder sb=new StringBuilder(s);
    
            int count[]=new int[sb.length()];
            
            int i=0;
            while(i<sb.length()){
                
                if(i==0 || sb.charAt(i) != sb.charAt(i-1)){
                    count[i]=1;
                }
                else{
                    count[i]=count[i-1]+1;
                    if(count[i]==k){
                        sb.delete(i-k+1,i+1);
                        i=i-k;
                    }
                }
                i++;
            }
            return sb.toString();
            
        }

}