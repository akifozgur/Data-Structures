package simpleQueue;

public class LinkedListSimpleQueue {

    private int size;
	private Node head;

  	public LinkedListSimpleQueue() {
		this.size = 0;
		this.head = null;
  	}
    


    public void enqueue(int data) {
		Node node = new Node();
		node.data = data;
		Node tmp = this.head;

		if (this.head == null) {
			this.head = node;
			this.head.next = null;
			this.size = 1;
		} else {

			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
			node.next = null;
			this.size += 1;
		}
  	}


    public void dequeue() {
		if(head != null){
			this.head = this.head.next;
			this.size--;
		}else{
			System.out.println("Queue is empty");
		}
  	}

    public void printQueue() {
		if (this.isEmpty())
			System.out.println("Print Queue: There are no nodes in the Queue.");
		else {
			Node tmp = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.print(tmp.data + " ");
				tmp = tmp.next;
			}
            System.out.println();
		}
	}

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        else return false;
    }

	public int getQueueSize(){
		return size;
	}
    
}
