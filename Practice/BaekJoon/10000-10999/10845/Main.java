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
push X: ���� X�� ť�� �ִ� �����̴�.
pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ť�� ����ִ� ������ ������ ����Ѵ�.
empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
*/
