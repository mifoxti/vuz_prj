package upd_23.pr232.pr232;

interface Queue {
    void enqueue(Object element);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}
