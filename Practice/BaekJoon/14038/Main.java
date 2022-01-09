package N14038;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		String[] array = new String[6];
		
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = st.nextToken();
		}
		
		int cnt = 0;
		
		for(int i = 0; i < 6; i++) {
			if(array[i].equals("W"))
				cnt++;
		}
		
		if(cnt > 4) {
			bw.write("1");
		}
		else if(cnt > 2) {
			bw.write("2");
		}
		else if(cnt > 0) {
			bw.write("3");
		}
		else {
			bw.write("-1");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}