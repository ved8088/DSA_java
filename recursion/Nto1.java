package recursion;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);

    }

    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);

    }

}
