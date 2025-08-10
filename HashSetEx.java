import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args) {
     HashSet<String> map = new HashSet<>();
     map.add("iust");
     map.add("cse");
     map.add("6th sem");
     map.add("iust"); // no duplicate
     
     System.out.println(map);
    }
    
}
