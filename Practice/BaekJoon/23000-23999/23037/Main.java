package N23037;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n >= 10000 && n < 100000) {
			int sum = 0;
			
			while(n != 0) {
				sum += Math.pow(n%10, 5);
				n /= 10;
			}
			System.out.print(sum);
		}
		br.close();
	}
}