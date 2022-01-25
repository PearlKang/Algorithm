package N10814;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Person[] person = new Person[N];
		
		if(N >= 1 && N <= 100000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				person[n] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
			}
			
			Arrays.sort(person, new Comparator<Person>() {
				public int compare(Person p1, Person p2) {
					return p1.age - p2.age;
				}
			});
			
			for(int n = 0; n < N; n++) {
				bw.write(person[n].age + " " + person[n].name);
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static class Person {
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
}