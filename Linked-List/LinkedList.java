package LinkedList;

public class LinkedList {
  	private int size;
	private Node head;

  	public LinkedList() {
		this.size = 0;
		this.head = null;
  	}

	// Inserting new node at the end of the linked list
  	public void insertNode(String data) {
		Node node = new Node();
		node.data = data;
		Node tmp = this.head;

		if (this.head == null) {
			this.head = node;
			this.head.next = null;
			this.size = 1;
			System.out.println(this.head.toString());
		} else {

			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
			node.next = null;
			this.size += 1;
		}
  	}
  

	// Adding node at the first location of the linked list
  	public void insertFirst(String data){
		Node node = new Node();
		node.data = data;
		node.next = this.head;
		this.head = node;
		this.size++;
  	}
  
	// Adding node at the nth location of the linked list
  	public void insertNth(String data, int position) {
		Node node = new Node();
		node.data = data;
		Node tmp = this.head;
		if (this.head != null && position <= this.size) {
			for (int i = 1; i < position; i++) {
				tmp = tmp.next;
			}
			node.next = tmp.next;
			tmp.next = node;
			this.size += 1;
		}else{
			System.out.println("Exceeded the linked list size. tmp Size: "+size);
		}
  	}

	// Deleting the first node from the list
  	public void deleteFirstNode() {
		if(head != null){
			this.head = this.head.next;
			this.size--;
		}else{
			System.out.println("Linked list is empty");
		}
  	}

	// Deleting the last node from the list
  	public void deleteLastNode() {
		Node tmp = this.head;
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

	// Deleting the node from the nth location in the list
	public void deleteNthNode(int position) {
		if (position <= this.size && this.head != null) {
			Node tmp = this.head;
			Node prevNode = null;
			for (int i = 0; i < position; i++) {
				prevNode = tmp;
				tmp = tmp.next;
			}
			prevNode.next = tmp.next;
			this.size--;
		}else{
			System.out.println("No node exist at location: "+position);
		}
	}

	
	// Find if the node exist in the list
	public void findNode(String data) {
		Node node = this.head;
		boolean found = false;
		for(int i=0;i<size; i++){
			if(node.data.equals(data)){
				System.out.println("Data "+data+" was found at location "+i+" in the linked list");
				found = true;
			}
			node = node.next;
		}
		
		if(!found)
			System.out.println("Data "+data+" was not found in the Linked list");
	}

	// Find the node data located at a specific location 
	public void findNodeAt(int location) {
		Node node = this.head;
		if(head !=null && location<= size){
			for(int i=0;i<location;i++){
				node = node.next;
			}
			System.out.println("Node data at location "+location+" is "+node.data);
		}
	}

	// Find the data at the last location
	public void findLastNode() {
		Node node = this.head;
		if(head != null){
			for(int i=0;i<size-1;i++){
				node = node.next;
			}
			System.out.println("Node data at last location is "+node.data);
		}
	}


	// Printing all the datas in the list
	public void printNodes() {
		if (this.size < 1)
			System.out.println("There are no nodes in the linked list");
		else {
			Node tmp = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.println("Node " + tmp.data + " is at location " + i);
				tmp = tmp.next;
			}
		}
	}
	
	// Obtain the tmp size of the list
	public int getListSize(){
		return size;
	}

}