public class Solution {
    
        int max = 0;
        int sub_index = 0;    
    
    public String longestPalindrome(String s) {
        
        if (s.length() < 2) {
            return s;
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            //when length of substring is odd
            lengthOfSubstring(s, i, i);
            //when length of substring is even
            lengthOfSubstring(s, i, i + 1);
        }
        
        return s.substring(sub_index, sub_index + max);
    }
    
    private void lengthOfSubstring(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        int len = (end - start - 1);
        if (len > max) {
            max = len;
            sub_index = start + 1;
        }
    }
}