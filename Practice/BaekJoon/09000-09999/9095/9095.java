import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		for(int i = 0;i < T;i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			System.out.println(cal(N));
		}
	}
	public static int cal(int n) {
		if(n < 0)
			return 0;
		if(n == 0 || n == 1)
			return 1;
		else
			return cal(n-1) + cal(n-2) + cal(n-3);
	}
}
