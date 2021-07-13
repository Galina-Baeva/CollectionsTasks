package FirstTask;
import java.util.*;

public class HashSetTask {
    public static void main(String[] args) {
        Set<String> weekDays = new HashSet<>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Tuesday");
        System.out.println(weekDays);
        System.out.println("Is Monday a weekday? : " + weekDays.contains("Monday"));
        weekDays.remove("Sunday");
        System.out.println("How many weekdays do we have? : " + weekDays.size());
        Iterator<String> iter = weekDays.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
