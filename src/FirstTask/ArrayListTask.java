package FirstTask;
import java.util.*;

public class ArrayListTask {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Azbuka");
        books.add("Algebra");
        books.add("Harry Potter");
        books.add("Hunger games");
        System.out.println(books);
        books.set(1, "The Lord of the Rings");
        books.remove(0);
        Collections.sort(books);
        Iterator<String> iter = books.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

