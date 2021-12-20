package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ���ü���_1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<String> result = new ArrayList<String>();
		int[] data = new int[n];
		int[] compare = new int[n];
		boolean flag = true;
		
		for(int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(br.readLine()); // �� �迭
		}
		int[] copyAr = data.clone();
		Arrays.sort(copyAr);
		
		int j = 0;
		for(int i = 0; i < n; i++) {
			stack.push(copyAr[i]);
			result.add("+");
			while(stack.peek() == data[j]) {
				compare[j++] = stack.pop();
				result.add("-");
				if(stack.isEmpty()) {
					break;
				}
			}
			
		}
		
		for (int i = 0; i < copyAr.length; i++) {
			if(data[i] != compare[i]) {
				flag = false;
				break;
			}
		}
		
		for (int i = 0; i < result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		
		if(flag) System.out.println(sb);
		
		else System.out.println("NO");			

		
	}
}
