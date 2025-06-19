package cloning;

public class Human {

    int age;
    String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

}
