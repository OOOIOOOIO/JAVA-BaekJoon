package ť_��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class �似Ǫ��_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int r = K;
		for(int i = 1; i <= N; i++) {
			dq.addLast(i);
		}

		sb.append("<");
		//(7,3)
		for(int i = 0; i < N -1; i++) {
			for(int j = 0; j < K-1; j++) {
				dq.addLast(dq.remove());
			}
			sb.append(dq.remove()).append(", ");
		}
		sb.append(dq.peek()).append(">");
		
		System.out.println(sb);
		

	}
}
