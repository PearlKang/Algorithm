package N4101;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] input = br.readLine().split(" ");

			int input1 = Integer.parseInt(input[0]);
			int input2 = Integer.parseInt(input[1]);
			
			if(input1 == 0 && input2 == 0)
				break;
			
			if((input1 > 0 && input1 <= 1000000) && (input2 > 0 && input2 <= 1000000)) {
				if(input1 > input2)
					bw.write("Yes\n");
				else
					bw.write("No\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}