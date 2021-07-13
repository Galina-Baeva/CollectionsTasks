package ThirdTask;

import javax.swing.text.html.HTMLDocument;

public class DemoLinkedList {
    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.remove("six");

        for (int i = 0; i < CustomLinkedList.size; i++) {
            System.out.println(list.get(i));
        }

    }
}
