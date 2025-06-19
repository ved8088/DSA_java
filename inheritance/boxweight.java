package inheritance;

public class boxweight extends Box{
    double weight;

    public boxweight(){
        this.weight = -1;
    }

    public boxweight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight = weight;
    }

    boxweight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    boxweight(boxweight other){
        super(other);
        weight = other.weight;
    }

}
