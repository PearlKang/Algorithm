package N3052;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[10];
		int[] chk = new int[42];
		int cnt = 0;
		
		for(int i = 0; i < 10; i++)
			array[i] = Integer.parseInt(br.readLine()) % 42;
		
		for(int i = 0; i < 10; i++)
			chk[array[i]] = 1;
		
		for(int i = 0; i < 42; i++)
			if(chk[i] == 1)
				cnt++;
		
		System.out.println(cnt);
		br.close();
	}
}