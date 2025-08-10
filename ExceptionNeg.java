
class negativeAgeException extends Exception{

    public negativeAgeException(String msg) {
        super(msg);
    }
}


public class ExceptionNeg {
    public static void main (String [] args) {
        try{ 
            checkage(-3);
        }
        catch(negativeAgeException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Exected finally block");
        }

    }

    static void checkage(int age)throws negativeAgeException{
        if(age<0){
            throw new negativeAgeException("Age cannot be negative");
        }
        System.out.println("Valid age");
    }
    
}
