package Stacks_Queue;

import java.util.Arrays;

public class twostacks {
    static int(int x,int[] a,int[] b){
        return twostacks(x,a,b,0,0) - 1;
    }

    private static int twostacks(int x,int[] a,int[] b,int sum,int count){

        if(sum > x){
            return count;
        }

        if(a.length ==0 || b.length == 0){
            return count;
        }

        int ans1 = twostacks(x, Arrays.copyOfRange(a,1,a.length),b,sum + a[0],count++);
        int ans2 = twostacks(x,a,Arrays.copyOfRange(b,1,b.length),sum + b[0],count++);

        return Math.max(ans1,ans2);
    }

}
