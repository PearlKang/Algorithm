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
				st = new StringTokenizer(br.readLine());

				input1 = st.nextToken();
				
				if(input1.equals("push_front")) {
					input2 = Integer.parseInt(st.nextToken());

					if(input2 < 1 || input2 > 100000)
						break;

					for(int m = N-1; m >= 0; m--) {
						if(m != 0)
							array[m] = array[m-1];
						else
							array[0] = input2;
					}
				}
				else if(input1.equals("push_back")) {
					input2 = Integer.parseInt(st.nextToken());

					if(input2 < 1 || input2 > 100000)
						break;

					for(int m = 0; m < N; m++) {
						if(array[m] == 0) {
							array[m] = input2;
							break;
						}
					}
				}
				else if(input1.equals("pop_front")) {
					if(array[0] == 0)
						System.out.println(-1);
					else {
						System.out.println(array[0]);

						for(int m = 0; m < N-1; m++)
							array[m] = array[m+1];
					}
				}
				else if(input1.equals("pop_back")) {
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
				}
				else if(input1.equals("size")) {
					for(int m = 0; m < N; m++) {
						if(array[m] == 0) {
							System.out.println(m);
							break;
						}
					}
				}
				else if(input1.equals("empty")) {
					if(array[0] == 0)
						System.out.println(1);
					else
						System.out.println(0);
				}
				else if(input1.equals("front")) {
					if(array[0] == 0)
						System.out.println(-1);
					else
						System.out.println(array[0]);
				}
				else if(input1.equals("back")) {
					if(array[0] == 0)
						System.out.println(-1);
					else {
						for(int m = 0; m < N; m++) {
							if(array[m] == 0) {
								System.out.println(array[m-1]);
								break;
							}
						}
					}
				}
			}
		}
	}
}
