package mmdc;

import java.util.Iterator;

public class LinkedList {
    public void run() {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");
        linkedList.add("test4");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
