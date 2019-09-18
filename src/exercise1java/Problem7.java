package exercise1java;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array= new int[8];
		Arrays.fill(array, Integer.MAX_VALUE);
		int i=0,count=0;
		int n=sc.nextInt();
		while(n>0) {
			int number = n%10;
			
			
			count++;
			n=n/10;
			array[i++]=number;
			
		}
		Arrays.sort(array);
		for(int j=0;j<count;j++) {
		System.out.print(array[j]+",");
		}
		

	}

}
