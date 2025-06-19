package recursion;

public class powerOfTwo {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }else if(n==2){
            return true;
        }
        else if(n%4==0){
            return true;
        }else{
            return false;
        }
    }
}
