package leetcode;

public class pow_88 {
    public double myPow(double x, int n){
        if(n==0){
            return 1.0;
        }
        if(n==1){
            return x;

        } // for even numbers

        if(n%2==0)
        {
            return myPow(x*x,n/2);
        }
        // for odd numbers
        return x * myPow(x, n -1 );
    }
}
