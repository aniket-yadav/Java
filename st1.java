import java.util.Stack;
class stack1{
	public static void main(String[] args) {
		Stack<Object> stack = new Stack<Object>();
		stack.push(8);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	    stack.push("aniket");
	    stack.push('A');
	    stack.push(5.4);
	    System.out.println(stack.isEmpty());
	    System.out.println(stack.peek());
	    System.out.println(stack.pop());
	    System.out.println(stack.peek());
	    System.out.println(stack.search("aniket"));
	}
}