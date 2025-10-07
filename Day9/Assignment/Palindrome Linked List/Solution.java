import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        solve (ans ,new ArrayList<>() ,0 ,s );
        return ans;
    }

    public void solve(List<List<String>> ans , List<String> temp ,int i,String s){
        if (i == s.length()) {
            ans.add(new ArrayList<>(temp));
             return;
             }
        for (int idx = i ; idx<s.length() ;idx++){
            if (ispalindrome(s, i ,idx)){
                temp.add(s.substring(i , idx+1));
                solve(ans ,temp ,idx+1,s);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean ispalindrome(String s, int b , int l){
        while(b <= l){
            if(s.charAt(b) != s.charAt(l)) return false ; 
            b++;
            l--;
        }
        return true ;
    }
}