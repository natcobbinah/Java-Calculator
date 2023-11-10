package stack_ADT;

public class Test_LinkedStack {

	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop()); //dcba
//		}
		
		System.out.println(stack.peek()); //d
		
		System.out.println(stack.size()); //4
		
	}

}
