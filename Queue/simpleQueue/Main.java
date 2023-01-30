package simpleQueue;

public class Main {
    public static void main(String[] args) {
        
        LinkedListSimpleQueue queue = new LinkedListSimpleQueue();

        for(int i =0; i<10; i++) {
			queue.enqueue(i);
		}
		
		queue.printQueue();
		
		System.out.println(queue.isEmpty()); 
		
		queue.printQueue();
		queue.dequeue();
		queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(11);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
		queue.printQueue();
        queue.enqueue(13);
        queue.printQueue();

    }
}