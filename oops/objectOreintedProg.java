package oops;

public class objectOreintedProg {

    public static void main(String[] args) {
        Student ved = new Student(2,"Ved Umesh Raut",98f);

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";
        System.out.println(two.name);

//        System.out.println(ved.rno);
//        System.out.println(ved.name);
//        System.out.println(ved.marks);
    }



}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 13;
        this.name = "Ved Umesh Raut";
        this.marks = 90f;
    }

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}

class A{
    final int num = 10;
    String name;

    public A(String Name){
        this.name = name;
    }
}
