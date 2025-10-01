import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String S) {
        Set<Character> set = new HashSet<>();
        int s=0;
        int l=0;
        int c=0;
        while(s<=l && l< S.length()){

            if (!set.contains(S.charAt(l))) {
                set.add(S.charAt(l));
                c= Math.max(c,set.size());
                l++;
            }
            else
                set.remove(S.charAt(s++));
        }
        
        return c;
    }
}