package ThirdTask;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    protected ArrayList<T> list = new ArrayList<>();
    protected int size = 0;

    public int getSize() {
        return size;
    }

    public CustomLinkedList() {
        ArrayList<T> list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
        size++;
    }

    public void remove(T t) {
        if (list.contains(t)) {
            list.remove(t);
            size--;
        }
    }


    public void reverse() {
        ArrayList<T> reverseList = new ArrayList<>();
        for (int i = getSize() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        list = reverseList;
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

}
