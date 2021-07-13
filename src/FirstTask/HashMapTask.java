package FirstTask;
import java.util.*;

public class HashMapTask {
    public static void main(String[] args) {
        Map<Integer, String> ages = new HashMap<>();
        ages.put(45, "Ivanov");
        ages.put(34, "Petrov");
        ages.put(18, "Sidorov");
        ages.put(29, "Barashkin");
        System.out.println(ages);
        System.out.println("What is the last name of the person aged 30 : " + ages.get(30));
        ages.remove(18);
        ages.put(29, "Sidorov");
        ages.forEach((k, v) ->
                System.out.println("Lastname: " + v + ", age: " + k));
    }

}
