package mmdc;

public class LinkedList {
    public void run() {
        var linkedList = new java.util.LinkedList<String>();
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");
        linkedList.add("test4");

        var iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
