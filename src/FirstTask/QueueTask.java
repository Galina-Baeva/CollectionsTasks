package FirstTask;
import java.util.*;

public class QueueTask {
    public static void main(String[] args) {
        Queue<Integer> height = new LinkedList<>();
        height.add(165);
        height.add(203);
        height.add(156);
        height.add(178);
        height.add(192);
        height.add(169);
        System.out.println(height);
        height.offer(178);
        System.out.println("Who's the first in line? : " + height.peek());
        height.poll();
        for (Integer h : height) {
            System.out.println(h);
        }
    }
}
