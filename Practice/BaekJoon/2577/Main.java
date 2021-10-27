package N2577;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 2; i++)
			input *= Integer.parseInt(br.readLine());
		
		int[] array = new int[10];
		
		while(input != 0) {
			array[input % 10]++;
			input /= 10;
		}
		
		for(int i : array)
			System.out.println(i);
			
		br.close();
	}
}