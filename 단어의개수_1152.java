package ���ڿ�;

import java.util.Scanner;

public class �ܾ��ǰ���_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� �����ؼ� �ޱ�(.isemty()�� �ϱ�����)
		String word = sc.nextLine().trim();
		
 		
		String splitWord[] = word.split(" ");

		if(word.isEmpty()) System.out.println("0");
		
		
		else System.out.println(splitWord.length);
	
	}
}
