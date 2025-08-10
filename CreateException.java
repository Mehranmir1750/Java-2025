// // Step 1: Create custom exception
// class InvalidAgeException extends Exception {
//     InvalidAgeException(String message) {
//         super(message);
//     }
// }

// public class CreateException {
//     public static void main(String[] args) {
//         try {
//             checkAge(15); // Will throw our custom exception
//         } 
//         catch (InvalidAgeException e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     // Step 2: Method that can throw the exception
//     static void checkAge(int age) throws InvalidAgeException {
//         if (age < 18) {
//             throw new InvalidAgeException("You must be 18 or older.");
//         }
//         System.out.println("Age is valid.");
//     }
// }

class AgeException extends Exception{

    AgeException(String msg){
        super(msg);
    }


}
public class CreateException{
    public static void main(String [] args){
        try {
            CheckAge(15);

        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
    static void CheckAge(int age) throws AgeException{
        if (age<18){
            throw  new AgeException("must be 18 or older");
        }
         System.out.println("Age is valid.");
    }
}