package ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ū��_10757_BigInteger {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		System.out.println(new BigInteger(arr[0]).add(new BigInteger(arr[1])));
		
/*
	 int�� �޸� ũ��� 4byte�� ǥ���� �� �ִ� ������ -2,147,483,648 ~ 2,147,483,647�̰� 
	long�� �޸� ũ��� 8byte�� ǥ���� �� �ִ� ������ -9,223,372,036,854,775,808 ~ 
	9,223,372,036,854,775,807�̴�. �⺻ �������δ� �� ������ �Ѿ�� ������ ���� ���� Ȥ�� 
	�˰��� ������ Ǯ �� ������ ���� Ȥ�� ������ �Ѿ�� ������ ��� BigInteger�� ����Ѵ�. 
	
	 ���� �ʹ� ũ��, �� int -2,150,000,000 ~ -2,150,000,000 ������ �Ѿ�� �Ϲ����� �������δ� �Ұ���
		
	 �Ϲ������� 1! ~ 20!(���丮��)�� �ִ� �Ѿ�� BigInteger ��� 
	 long�� 9,~~,~... ","�� 6��
	 
	< �����ϱ� >
	
	BigInteger num1 = new BigInteger("2498619848418918")
	--> ���ڿ��� ������ ������Ѵ�.
	
	
	< �� ��ȯ >
	
	BigInteger bigNumber = BigInteger.valueOf(100000); //int -> BigIntger
	--> int a = Integer.valueOf("101") ���� ����. String -> int

	int int_bigNum = bigNumber.intValue(); //BigIntger -> int
	long long_bigNum = bigNumber.longValue(); //BigIntger -> long
	float float_bigNum = bigNumber.floatValue(); //BigIntger -> float
	double double_bigNum = bigNumber.doubleValue(); //BigIntger -> double
	String String_bigNum = bigNumber.toString(); //BigIntger -> String
	
	< ���� >
	
	BigInteger bigNumber1 = new BigInteger("100000");
	BigInteger bigNumber2 = new BigInteger("10000");
			
	System.out.println("����(+) :" +bigNumber1.add(bigNumber2));
	System.out.println("����(-) :" +bigNumber1.subtract(bigNumber2));
	System.out.println("����(*) :" +bigNumber1.multiply(bigNumber2));
	System.out.println("������(/) :" +bigNumber1.divide(bigNumber2));
	System.out.println("������(%) :" +bigNumber1.remainder(bigNumber2));
  
  	< �� >
  	
	BigInteger bigNumber1 = new BigInteger("100000");
	BigInteger bigNumber2 = new BigInteger("1000000");
			
	// .compareTo -->  compareTo ������ 0   Ʋ���� -1
	int compare = bigNumber1.compareTo(bigNumber2);
	System.out.println(compare);
 */
		
		
		
		
		
		
//		< �Ϲ����� ���� >
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str);
//		
//		bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//		bw.close();
		
//		����
//		bw.write(st.nextToken() + st.nextToken() + "\n");
//		System.out.println("af");
//		bw.write("�輺ȣ");
//		bw.close();
		
		
	
	}
}
