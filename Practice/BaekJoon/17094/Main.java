package N17094;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int sLength = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		
		if(sLength != s.length() && sLength >= 1 && sLength <= 100000)
			return;
		
		int cnte = 0;
		int cnt2 = 0;
		
		for(int i = 0; i < sLength; i++) {
			char tmp = s.charAt(i);
			
			if(tmp == 'e')
				cnte++;
			if(tmp == '2')
				cnt2++;
		}
		
		if(cnte == cnt2)
			bw.write("yee");
		if(cnte > cnt2)
			bw.write("e");
		if(cnte < cnt2)
			bw.write("2");
		
		bw.flush();
		bw.close();
		br.close();
	}
}