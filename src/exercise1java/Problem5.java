package exercise1java;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			int result =0;
			for(int i=0;i<n;i++) {
				int a= sc.nextInt();
					result=result+a;
			}System.out.println("Sum of the numbers is "+result);
			

}
}
