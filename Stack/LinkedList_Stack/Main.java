package LinkedList_Stack;

public class Main {

	public static void main(String[] args) {
		
		
		LinkedListStack stack = new LinkedListStack();
		
		for(int i =0; i<10; i++) {
			stack.push(i);
		}
		
		stack.printStack();
		
		System.out.println(stack.isEmpty()); 
		
		stack.printStack();
        stack.peek(); 
		stack.pop();
		stack.pop();
        stack.pop();
        stack.pop();
        stack.push(11);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.pop();
		stack.printStack();
        stack.peek();
        stack.push(13);
        stack.printStack();
        stack.peek();
		
	}

}
