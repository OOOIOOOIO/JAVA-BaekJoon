package ���ڿ�;


import java.util.Scanner;

public class �ܾ��ǰ���_1157 {
	public static void main(String[] args) {
		int[] cnt = new int[26]; // 0���� �˾Ƽ� �ʱ�ȭ ��
		int max = 0;
		char result = '?';
		Scanner sc = new Scanner(System.in);
		
		// �ҹ��ڷ� �ޱ�
		String word = sc.next().toUpperCase();
		
		
		
		for(int i = 0; i < word.length(); i++) {
            // ���� �� ����
			cnt[word.charAt(i) - 65]++;
			
            // �ִ��
			if(cnt[word.charAt(i) - 65] > max) {
			    max = cnt[word.charAt(i) - 65];
				result = word.charAt(i);
			}
			else if(cnt[word.charAt(i) - 65] == max) result = '?'; 
			
		}
		System.out.println(result);
        
    }
}	
		
		// �ƽ�Ű �ڵ� �ֱ� 1�� : A-Z, 2�� : a-z
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 26; j++) {
//				if(i == 0) ASCII[i][j] = (char)(65 + j);
//				else ASCII[i][j] = (char)(65 + j + 32); 
//			}
//		}
//		
//		 �ƽ�Ű �ڵ尡 �� ������ Ȯ���غ���
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 26; j++) {
//				System.out.println(ASCII[i][j]);
//			}
//		}

		
		
		
		
		
//	}
//}
