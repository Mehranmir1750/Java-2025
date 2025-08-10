import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map); // Order preserved: 3, 1, 2
    }
}
