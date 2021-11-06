package N4673;

class Main {
	public static void main(String[] args) throws Exception {
		boolean flag = false;
		
		for(int i = 1; i <= 10000; i++) {
			for(int j = 1; j < i; j++)
				if(i == dn(j))
					flag = true;
			
			if(!flag)
				System.out.println(i);
			
			flag = false;
		}
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