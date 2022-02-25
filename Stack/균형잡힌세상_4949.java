package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상_4949 {
	
	public String match(String input) {
		Stack<Character> stack = new Stack();
		
		for(char a : input.toCharArray()) {
			if(a == '(' || a == '[') {
				stack.push(a);
			}
			
			
			else if(a == ')') {
				if(!(stack.empty()) && stack.peek() == '(') stack.pop(); // 스택이 비어있지 않고 짝이 맞을 때
                    
                		else return "no";
				
			}
			
			else if(a == ']') {
				if(!(stack.empty()) && stack.peek() == '[') stack.pop(); // 스택이 비어있지 않고 짝이 맞을 때
                    
                		else return "no";
			}
		}
		if(stack.isEmpty()) {
			return "yes"; // 맞게 다 빠져나와 스태이 비어있을 때만
		}
		else {
			return "no";
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		균형잡힌세상_4949 test = new 균형잡힌세상_4949();
		
		
		while(true) {
			String input = br.readLine();
			if(input.equals(".")) break;
			
			
			sb.append(test.match(input)).append("\n");
			
			
		}
		
		System.out.println(sb);
	}
}
