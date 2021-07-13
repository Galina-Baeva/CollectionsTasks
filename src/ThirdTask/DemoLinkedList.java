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

        list.remove("Three");
        for (String s: list) {
            System.out.println(s);
        }

        list.reverse();

       for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
