package recursion;

public class digitSum {
    public static void main(String[] args) {

//        reverse(1234);
//        System.out.println(sum);

//        System.out.println(rev2(1234));
//        System.out.println(palindrom(121));

        count(100002);
//        System.out.println(CountSum);



    }
    static int sum(int n){
        if(n==0){
            return 0;

        }
        return (n%10) + sum(n/10);

    }

    static int prod(int num){
        if(num%10 == num){
            return num;
        }

        return (num%10) * prod(num/10);

    }

    static int sum = 0;

    static void reverse(int rev){

        if(rev == 0){
            return;
        }

        int rem = rev%10;
        sum = sum*10 + rem;
        reverse(rev/10);
        System.out.println(sum);

    }


    static int rev2(int n){
        // it will give total number of digits
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper(int n,int digits){
            if(n%10 == n){
                return n;

            }

            int rem = n % 10;
            return (rem * (int) Math.pow(10,digits -1) + helper(n/10,digits - 1));

    }

    static boolean palindrom(int n){
        return n == rev2(n);
    }

    static int count(int num){
       return helper2(num,0);

    }

    private static int helper2(int n,int c){
         if(n == 0){
             return c;
         }
         int rem = n%10;
         if(rem == 0){
             return helper2(n/10,c+1);
         }
         return helper2(n/10,c);


    }


}
