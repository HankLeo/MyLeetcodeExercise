public class Solution {
    public double myPow(double x, int n) {
        
        if (n == 0) {
            return 1.0;
        }
        if (n == 1) {
            return x;
        }
        if (x == 0.0) {
            if (n > 0) {
                return 0.0;
            }
            else {
                return Double.POSITIVE_INFINITY;
            }
        }
        
        double res = x;
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n++;
                x = 1 / x;
                return x * myPow(x, -n);
            }
            n = -n;
            x = 1 / x;
        }
        
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}