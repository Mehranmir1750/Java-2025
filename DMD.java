class Animal {
    void Sound(){
        System.out.println("Animals make sound");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("Meowww......");
    
}
}


public class DMD {
public static void main(String[] args) {
    Animal obj  = new Cat();
    obj.Sound();

}
    
}
