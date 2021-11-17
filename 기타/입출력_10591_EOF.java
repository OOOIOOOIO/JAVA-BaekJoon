package ��Ÿ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class �����_10591_EOF {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        String line = br.readLine();
	        int pos, a, b = 0;
	        
//	        �Է� Ƚ���� �־����� �ʰ� �Է¸� ���� ��, ���� �Է��� �� EOF ���
//	        InuputStreamRead(System.in)�� Ctrl + z(�ܼ�)(+Enter Ŀ�ǵ����)�� �Է��ϸ� �����ϴ� ������ �ν��ϰ� null �����ϰ�
//	        BufferedReader ���� System.in�� ���� �Է��� �ޱ� ������ readLine()�� null�� �����Ѵ�. 
	        while(line != null){	// EOF handling 
	            pos = line.indexOf(" ");
	            a = Integer.parseInt(line.substring(0,pos));
	            b = Integer.parseInt(line.substring(pos+1));
	            
	            bw.write(Integer.toString(a+b)); // String.valueOf(int��) �� ���� 
	            bw.newLine();
	            
	            line = br.readLine();
	        }
	        bw.flush();
	       
	}
}
/*
*  Scanner���� ��� sc.hasNext() �޼ҵ尡 ����. �Էµ� ��ū�� ������ true ������ false
*  
*  BufferedReader�� EOF�� ó���ϴ� ���� �Լ��� ����.
*  
*  �׷���
*  	String input = "";
*   
*  	while((input = br.readLine()) != null){
*  
*  	}
*  	Ȥ�� 
*  
*  	while(br.reaLine() != null){
*  	
*  	}
*  �̷� ������ ó��, br.readLine()���� ��� �е�, �Է��� ���� null�� �Ǹ� �ݺ����� ����
*  readLine() : ���� stream�� ���� �ٴٸ���(EOF) null ���� ��ȯ�Ѵ�. �ƹ��͵� �Է� ���ϸ� null ��ȯ 
*  			�ƹ��͵� �Է��� ���� �ʴ� ���� �ܼ� Ctrl + z / Ŀ�ǵ���� Ctrl + z + Enter�̴�.
*  			System.in�� Ű �Է��� �����ϴ� ������ �ν��ϰ� null�� ��ȯ�Ѵ�.
*  			
*/