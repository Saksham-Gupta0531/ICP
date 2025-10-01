import java.util.*;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int flag = 0;

        for (int right = 0; right < s2.length(); right++) {
            char ch = s2.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            while (right - left + 1 > s1.length()) {
                char removeChar = s2.charAt(left);
                window.put(removeChar, window.get(removeChar) - 1);
                if (window.get(removeChar) == 0) {
                    window.remove(removeChar);
                }
                left++;
            }

            if (right - left + 1 == s1.length()) {
                if (map.equals(window)) {
                    flag = 1;
                    return true;
                }
            }
        }

        return flag == 1;
    }
}
