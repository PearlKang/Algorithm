package N11549;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 1 && T <= 4) {
			st = new StringTokenizer(br.readLine());
			int[] array = new int[5];
			int count = 0;
			
			for(int i = 0; i < array.length; i++)
				array[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < array.length; i++)
				if(array[i] >= 1 && array[i] <= 4)
					if(T == array[i])
						count++;
				
			bw.write(String.valueOf(count));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}