package Array_Stack;

public class ArrayStack {

	private int[] stackSize;
	private int top;

	ArrayStack(int Size) {
		stackSize = new int[Size];
		top = -1;
	}

	public void push(int data) {
		if(this.isFull()){
			System.out.println("Push: There are no places in the Stack");
		}
		else stackSize[++top] = data;
	}

	public int pop() {
		if(this.isEmpty()){
			System.out.println("Pop: There are no data in the Stack");
			return 0;
		}
		else {
			return stackSize[top--] ;
		}
	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if ( (top+1) == stackSize.length) {
			return true;
		}
		return false;
	}

	public void peek() {
		if(this.isEmpty()){
			System.out.println("Peek: There are no data in the Stack");
		}
		else System.out.println("Data at last location is "+stackSize[top]);
	}

	public int getStackSize() {
		return top + 1;
	}

	public void printStack() {
		if (this.isEmpty()){
			System.out.println("Print Stack: There are no data in the Stack.");
		}else{
			for (int i = 0; i <= top; i++){
				System.out.print(stackSize[i] + " ");
			}
			System.out.println();
		}
	}

}