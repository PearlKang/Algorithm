package N9012;

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String VPS = st.nextToken();
			
			if(VPS.length() < 2 || VPS.length() > 50)
				continue;
			
			while(true) {
				String beforeVPS = VPS;
				String afterVPS = VPS.replace("()", "");
				VPS = afterVPS;
				
				if(beforeVPS.equals(afterVPS))
					break;
			}
			
			if(VPS.equals(""))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
