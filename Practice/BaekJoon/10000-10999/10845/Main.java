package N10845;

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 10000) {
			int[] array = new int[N];
			
			for(int i = 0; i < N; i++) {
				array[i] = 0;
			}
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				String M1 = st.nextToken();
				
				if(M1.equals("push")) {
					String M2 = st.nextToken();
					if(Integer.parseInt(M2) < 1 || Integer.parseInt(M2) > 100000)
						break;

					for(int i = 0; i < N; i++) {
						if(array[i] == 0) {
							array[i] = Integer.parseInt(M2);
							break;
						}
					}
				}
				else if(M1.equals("pop")) {
					if(array[0] == 0) {
						System.out.println(-1);
					}
					else {
						System.out.println(array[0]);
						for(int i = 0; i < N-1; i++) {
							if(array[i] == 0)
								break;
							
							array[i] = array[i+1];
						}	
					}
					array[N-1] = 0;
				}
				else if(M1.equals("size")) {
					for(int i = 0; i < N; i++) {
						if(array[i] == 0) {
							System.out.println(i);
							break;
						}
					}	
				}
				else if(M1.equals("empty")) {
					boolean flag = true;
					
					for(int i = 0; i < N; i++) {
						if(array[i] != 0) {
							flag = false;
							break;
						}
					}	
					
					if(flag)
						System.out.println(1);
					else
						System.out.println(0);
				}
				else if(M1.equals("front")) {
					if(array[0] == 0) {
						System.out.println(-1);
					}
					else {
						System.out.println(array[0]);	
					}
				}
				else if(M1.equals("back")) {
					if(array[0] == 0) {
						System.out.println(-1);
					}
					else {
						for(int i = 0; i < N; i++) {
							if(array[i] == 0) {
								System.out.println(array[i-1]);
								break;
							}
						}	
					}
				}
			}
		}
		else
			System.out.println("N input error !!");
	}
}
/*
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
