package N10828;

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
						for(int i = 0; i < N; i++) {
							if(array[i] == 0) {
								System.out.println(array[i-1]);
								array[i-1] = 0;
								break;
							}
						}	
					}
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
				else if(M1.equals("top")) {
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
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
*/
