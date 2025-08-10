public class ExceptionHand{

    public static void main(String [] args){
        try {
            int num = 10/0;
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Executed finally block");
        }
    }
}