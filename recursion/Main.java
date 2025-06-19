package recursion;

public class Main {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello MF");
        message1();
    }
    static void message1(){
        System.out.println("Hello MF");
        message2();
    }
    static void message2(){
        System.out.println("Hello MF");
        message3();
    }
    static void message3(){
        System.out.println("Hello MF");
        message4();
    }
    static void message4(){
        System.out.println("Hello MF");
    }
}
