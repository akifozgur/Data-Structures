package LinkedList_Stack;

public class LinkedListStack {

    private int size;
	private Node head;

  	public LinkedListStack() {
		this.size = 0;
		this.head = null;
  	}
    


    public void push(int data) {
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


    public void pop() {
		Node tmp = this.head;

        if (this.isEmpty()){
            System.out.println("Pop: There are no nodes in the Stack");
        }else{
            if(size == 1){
                head = null;
                size = 0;
            }else{
                Node prevNode = null;
                while (tmp.next != null) {
                    prevNode = tmp;
                    tmp = tmp.next;
                }
                prevNode.next = null;
                this.size--;
            }
        }
  	}

    public void printStack() {
		if (this.isEmpty())
			System.out.println("Print Stack: There are no nodes in the Stack.");
		else {
			Node tmp = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.print(tmp.data + " ");
				tmp = tmp.next;
			}
            System.out.println();
		}
	}

    public void peek() {
		Node node = this.head;
		if(head != null){
			for(int i=0;i<size-1;i++){
				node = node.next;
			}
			System.out.println("Node data at last location is "+node.data);
		}
        else{
            System.out.println("Peek: There are no nodes in the Stack.");
        }
	}

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        else return false;
    }

	public int getStackSize(){
		return size;
	}

}
