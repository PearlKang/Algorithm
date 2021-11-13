package N4673;

class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		
		boolean[] chk = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int dn = dn(i);
			
			if(dn <= 10000)
				chk[dn] = true;
		}
		
		for(int i = 1; i <= 10000; i++)
			if(!chk[i])
				sb.append(i).append(System.lineSeparator());
		
		System.out.print(sb);
	}
	
	public static int dn(int input) {
		int output = input;
		
		while(input != 0) {
			output += input % 10;
			input /= 10;
		}
		return output;
	}
}