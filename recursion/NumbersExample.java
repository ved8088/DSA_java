package recursion;

public class NumbersExample {

    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int num){
        if(num==5){
            return;

        }
        System.out.println(num);
        print1(num+1);
    }

}
