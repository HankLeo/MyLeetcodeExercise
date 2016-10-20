public class Solution {
    public int myAtoi(String str) {
        
        String s = str.trim();
        StringBuffer sb = new StringBuffer();
        int symbol = 1;
        
        if (s.equals("")) {
            return 0;
        }
        //distinguish positive and negative
        char c = s.charAt(0);
        if (c == '-') {
            symbol = -1;
        }
        else if (c == '+') ;
        else if (c >= '0' && c <= '9') {
            sb.append(c);
        }
        else {
            return 0;
        }
        
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }
            else {
                break;
            }
        }
        
        s = sb.toString();
        if (s.equals("")) {
            return 0;
        }
        
        //in case out of bound 
        try {
            return symbol * Integer.valueOf(s);
        }
        catch (Exception e) {
            return symbol == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        
    }
}