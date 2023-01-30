package priorityQueue;

public class Main {
    public static void main(String[] args) {

        LinkedListPriorityQueue queue = new LinkedListPriorityQueue();

        queue.enqueue("test1",10);
        queue.enqueue("test2",2);
        queue.enqueue("test3",7);
        queue.enqueue("test4",11);
        queue.enqueue("test5",5);
        queue.enqueue("test6",6);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();
    }

}
