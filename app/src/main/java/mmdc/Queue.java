package mmdc;

public class Queue {
    public void run() {
        java.util.Queue<Integer> queue = new java.util.LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
