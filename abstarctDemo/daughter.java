package abstarctDemo;

public class daughter extends Parent{
    @Override
    void carrer(String name) {
        System.out.println("I am "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love Captain America");
    }
}
