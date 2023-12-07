package upd_23.pr232.pr232;

public class Main {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("Queue size: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}
