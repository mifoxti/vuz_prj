package upd_23.pr231.pr231;

public class Main {
    public static void main(String[] args) {
        // Тест класса ArrayQueueModule
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        System.out.println(ArrayQueueModule.dequeue()); // "A"
        System.out.println(ArrayQueueModule.element()); // "B"
        System.out.println(ArrayQueueModule.size()); // 1
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true

        // Тест класса ArrayQueue
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("X");
        queue.enqueue("Y");
        System.out.println(queue.dequeue()); // "X"
        System.out.println(queue.element()); // "Y"
        System.out.println(queue.size()); // 1
        queue.clear();
        System.out.println(queue.isEmpty()); // true
    }
}