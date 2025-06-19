package inheritance;

public class Box {
    double l;
    double h;
    double w;


    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Box(double l, double w, double h){
        this.w = l;
        this.l = w;
        this.h = h;
    }

    Box(Box old){
        this.w = old.w;
        this.l = old.l;
        this.h = old.h;
    }

    public void info(){
        System.out.println("Running the box");
    }

}
