package N10866;

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String input1; 
		int input2;
		int[] array = new int[N];
		
		if(N >= 1 && N <= 10000) {
			for(int n = 0; n < N; n++) {
				array[n] = 0;
			}
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				
				input1 = st.nextToken(); 
				
				switch(input1) {
				case "push_front":	//push_front X: ���� X�� ���� �տ� �ִ´�.
					input2 = Integer.parseInt(st.nextToken());
					
					if(input2 < 1 || input2 > 100000)
						break;
					
					for(int m = N-1; m >= 0; m--) {
						if(m != 0)
							array[m] = array[m-1];
						else
							array[0] = input2;
					}
					
					break;
				case "push_back":	//push_back X: ���� X�� ���� �ڿ� �ִ´�.
					input2 = Integer.parseInt(st.nextToken());
					
					if(input2 < 1 || input2 > 100000)
						break;

					for(int m = 0; m < N; m++) {
						if(array[m] == 0) {
							array[m] = input2;
							break;
						}
					}
					
					break;
				case "pop_front":	//pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
					if(array[0] == 0)
						System.out.println(-1);
					else {
						System.out.println(array[0]);
						
						for(int m = 0; m < N-1; m++)
							array[m] = array[m+1];
					}
					
					break;
				case "pop_back":	//pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
					if(array[0] == 0)
						System.out.println(-1);
					else {
						for(int m = 0; m < N; m++) {
							if(array[m] == 0) {
								System.out.println(array[m-1]);
								array[m-1] = 0;
								break;
							}
						}
					}

					break;
				case "size":		//size: ���� ����ִ� ������ ������ ����Ѵ�.
					int count = 0;
					for(int m = 0; m < N; m++) {
						if(array[m] != 0)
							count++;
						else {
							System.out.println(count);
							break;							
						}
					}
					break;
				case "empty":		//empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
					if(array[0] == 0)
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":		//front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
					if(array[0] == 0)
						System.out.println(-1);
					else
						System.out.println(array[0]);
					break;
				case "back":		//back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
					if(array[0] == 0) {
						System.out.println(-1);
						break;
					}						
					
					for(int m = 0; m < N; m++) {
						if(array[m] != 0)
							continue;
						else {
							System.out.println(array[m-1]);
							break;
						}
					}
					break;
				}
			}
		}
	}
}