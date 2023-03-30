package mmdc;

public class Queue {
    public void run() {
        var queue = new java.util.LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
