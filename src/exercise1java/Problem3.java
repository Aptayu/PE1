package exercise1java;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a word");
		String s = sc.nextLine();
		System.out.println(s.length());
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println(c+" is a consonant");
			}else System.out.println(c+" is a vowel");
			
			
			
		}
	
		
}
}