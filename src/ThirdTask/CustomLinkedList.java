package ThirdTask;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    protected ArrayList<T> list = new ArrayList<>();
    static int size = 0;

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

    public void reverse(ArrayList<T> reverseList) {
        for (int i = list.size() - 1; i == 0; i--) {
            reverseList.add(list.get(i));
        }
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < size - 1;
            }

            @Override
            public T next() {
                return list.get(i++);
            }
        };
        return null;
    }

    /*@Override
    public boolean hasNext() {
        return list.hasNext();
    }

    @Override
    public T next() {
        return null;
    }*/
}
