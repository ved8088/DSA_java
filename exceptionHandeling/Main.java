package exceptionHandeling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;

        try{
           String name = "Ved";
           if(name.equals("Ved")){
               throw new MyException("Name is ved");
           }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("normal exception");
        }finally {
            System.out.println("this will always execute ");
        }

    }

     static int divide(int a,int b) throws ArithmeticException{

            if(b==0){
                throw new ArithmeticException("Please do not divide by zero");

            }

            return a/b;

        }


}
