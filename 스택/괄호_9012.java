package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ��ȣ_9012 {
	
	public static String match(String input) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') stack.push('(');
			
			// �� ó���� ) �̰� ��� �� ��
			else if(stack.empty()) return "NO";
			
			else stack.pop();
		}
		
		if(stack.empty()) return "YES";
		
		// ( �̰� ���� ���� ��
		else return "NO";
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++) {
			sb.append(match(br.readLine())).append("\n");
			
		}
				
		System.out.println(sb);
		
	
	}
}
