package exercise1java;

import java.util.Scanner;

public class Problem8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		do{
			a=sc.nextInt();
			if(a>1 && a<50) {
		}else System.out.println("Number is out of range");
		}while(a!=45);
}
}