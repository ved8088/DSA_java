package interfaces;

public class car implements Engine, brake, media{
    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }


    @Override
    public void brake() {
        System.out.println("brake like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a Ferrari!! ");
    }

}
