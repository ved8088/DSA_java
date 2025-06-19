package polymorphism;

public class main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        shapes circle = new circle();
        sqaure square = new sqaure();
        triangle tri = new triangle();

        circle.area();
    }
}
