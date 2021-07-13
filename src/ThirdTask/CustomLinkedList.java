package ThirdTask;

public class CustomLinkedList<T> {
    T t;
    static int size = 0;
    T next;

    public CustomLinkedList(T t){
        this.t = t;
        size++;
        next = null;
    }

    public T getT() {
        return t;
    }

    public int getSize() {
        return size;
    }
    public void add(T t){
        this.next = t;
    }



}
    /*add an element;
        remove an element;
        reverse elements;
        iterate over the list (create your own Iterator implementation for that) */