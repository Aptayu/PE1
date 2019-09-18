package exercise1java;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			System.out.print(c);
			
		}
		
	}
}
