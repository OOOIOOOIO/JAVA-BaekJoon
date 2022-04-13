![image](https://user-images.githubusercontent.com/74396651/163112268-a21a23b4-3ddc-47f9-adb9-b26e87bbfaa0.png)

![image](https://user-images.githubusercontent.com/74396651/163112440-a7095138-6ab8-4bc0-a1a4-9209e54b6aef.png)


문제 링크 : https://www.acmicpc.net/problem/1541



# Split

```java
package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 잃어버린괄호_split_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int sum = Integer.MAX_VALUE;
		
		String[] sub = br.readLine().split("-");
		
		for(int i = 0; i < sub.length; i++) {
			int temp = 0;
			
			// 정규식에 +는 의미가 있는 아이이므로 \\를 붙여서 문자로 만들어준다
			String[] add = sub[i].split("\\+"); 
			
			for(int j = 0; j < add.length; j++) {
				temp += Integer.parseInt(add[j]);
			}
			
					
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}
			else {
				sum -= temp;
			}
			
		}
		
		System.out.println(sum);
		
	}
}


```

# StringTokenizer
```java
package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class 잃어버린괄호_st_1541 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
 
		while (subtraction.hasMoreTokens()) {
			int temp = 0;
 
			// 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
			StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
			
			// 덧셈으로 나뉜 토큰들을 모두 더한다. 
			while (addition.hasMoreTokens()) {
				temp += Integer.parseInt(addition.nextToken());
			}
			
			// 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
 
}
```
