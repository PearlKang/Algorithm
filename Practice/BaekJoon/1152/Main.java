package N1152;

class Main {
	public static void main(String[] args) throws Exception {
		int count = 0;
		int before = 32;
		
		while(true) {
			int word = System.in.read();
			
			if(word == 32) {
				if(before != 32)
					count++;
			}
			else if(word == 10) {
				if(before != 32)
					count++;
				break;
			}
			before = word;
		}
		System.out.println(count);
	}
}