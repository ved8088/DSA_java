package oops;

public class staticBlock {
    static int a = 4;
    static int b = 6;
// will only run once when the first object is created
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    private static staticBlock instance;

    public static void main(String[] args) {

        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;

        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        System.out.println(instance);

    }

}

