// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
public class _50pow_x_n {
    
}
class Solution {
    double result = 1;
    public double myPow(double x, int n) {
        try {
             if (n > 0) {
      return  myPow(x,n-1) * x;
    }
    else if (n<0){
      return  myPow(x,n+1)/x;
    }
    else{
        return 1;
    }
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
       return 1;
}
}