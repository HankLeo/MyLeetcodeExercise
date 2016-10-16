public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();
        //two pointer
        for (int left = 0, right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                //move left pointer to right of duplicated char last found
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            l = l > (right - left + 1) ? l : (right - left + 1);
        }
        
        return l;
    }
}