import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // duplicates allowed

        System.out.println(list.get(1)); // Banana
        System.out.println(list); // Order preserved
    }
}
