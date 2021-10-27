package N2577;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 1;
		
		for(int i = 0; i < 3; i++)
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