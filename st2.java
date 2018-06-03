import java.util.*;
class demoStack{
	public static void main(String[] args) {
		Stack<Character> stack=new Stack<Character>();
		String exp="23+8*2-4/2";
		char ex[] = exp.toCharArray();
		for(char c:ex){
            stack.push(c);
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
}