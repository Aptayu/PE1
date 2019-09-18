package exercise1java;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char c=s.charAt(0);
		if(c>='A'&&c<='Z') {
			System.out.println("Upper case");
			}else if(c>='a'&&c<='z')
				System.out.println("Lower case");
			else
				System.out.println("Special character");
		
		
		

	}

}
