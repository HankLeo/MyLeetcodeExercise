public class Solution {
    public int reverse(int x) {
        
        int res = 0;
        while (x != 0) {
            int temp = res;
            res = 10 * res + x % 10;
            //in case of beyond integer max value
            if ((res - x % 10) / 10 != temp) {
                return 0;
            } 
            x /= 10;
        }
        
        return res;
    }
}