package N10866;

import java.util.*;
import java.io.*;

class Main {
	static int N;
	static int[] array;
	static int size;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());

		array = new int[N];
		size = 0;
		
		if(N >= 1 && N <= 10000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				
				switch(st.nextToken()) {
				case "push_front":
					push_front(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					push_back(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					pop_front();
					break;
				case "pop_back":
					pop_back();
					break;
				case "size":
					System.out.println(size());
					break;
				case "empty":
					System.out.println(empty());
					break;
				case "front":
					System.out.println(front());
					break;
				case "back":
					System.out.println(back());
					break;
				}
			}
		}
	}
	
	static void push_front(int input) {
		if(input >= 1 && input <= 100000) {
			for(int m = size; m >= 0; m--) {
				if(m == 0)
					array[0] = input;
				else
					array[m] = array[m-1];
			}
			size++;
		}
	}
	
	static void push_back(int input) {
		if(input >= 1 && input <= 100000) {
			array[size] = input;
			size++;
		}
	}
	
	static void pop_front() {
		if(size == 0)
			System.out.println(-1);
		else {
			System.out.println(array[0]);
			
			for(int m = 0; m < size; m++)
				array[m] = array[m+1];
			
			size--;
		}
	}
	
	static void pop_back() {
		if(size == 0)
			System.out.println(-1);
		else {
			System.out.println(array[size-1]);
			array[size-1] = 0;
			size--;
		}
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if(size == 0)
			return 1;
		else
			return 0;
	}
	
	static int front() {
		if(size == 0)
			return -1;
		else
			return array[0];		
	}
	
	static int back() {
		if(size == 0)
			return -1;
		else
			return array[size-1];
	}
}