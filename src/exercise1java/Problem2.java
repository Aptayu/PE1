package exercise1java;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me a number");
	int a= sc.nextInt();
	
	if(20 < a && a < 30){
		if (a%2==0) {
			System.out.println("Jerry");
		}else System.out.println("Tom");
		}else
			System.out.println("Error");
	}
	
	

}
