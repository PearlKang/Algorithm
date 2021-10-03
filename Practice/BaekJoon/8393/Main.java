package N8393;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		System.out.println(sum(Integer.parseInt(st.nextToken())));
	}
	
	public static int sum(int n) {
		if(n != 1)
			return n + sum(n-1);
		else
			return n;
	}
}