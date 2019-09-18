package exercise1java;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1Compiled {
	public static void main(String[] args) {
		Exercise1Compiled ec = new Exercise1Compiled();
		System.out.println("Insert the problem number");
		Scanner sc= new Scanner(System.in);
		int p= sc.nextInt();
		
		switch(p) {
		case 1:
			ec.Problem1();
			break;
		case 2:
			ec.Problem2();
			break;
		case 3:
			ec.Problem3();
			break;
		case 4:
			ec.Problem4();
			break;
		case 5:
			ec.Problem5();
			break;
		case 6:
			ec.Problem6();
			break;
		case 7:
			ec.Problem7();
			break;
		case 8:
			ec.Problem8();
			break;
		case 9:
			ec.Problem9();
			break;
		case 10:
			ec.Problem10();
			break;
		}
		
	}
	public void Problem1() {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int temp = n;
		int reverse=0;
		int even=0;
			while(n>0) {
				int lastdigit=n%10;
				reverse=reverse*10+lastdigit;
				n/=10;
				if(lastdigit%2==0) {
					even=even+lastdigit;
					}
				
		}if(temp == reverse) {
			System.out.println("Number is palindrome and sum of even numbers is " +even);
			
		}else System.out.println("Number is not palindrome");
	}
	public void Problem2() {
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
	
	public void Problem3() {
	
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
	public void Problem4() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
		}	
	}
	public void Problem5() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int result =0;
		for(int i=0;i<n;i++) {
			int a= sc.nextInt();
				result=result+a;
		}System.out.println("Sum of the numbers is "+result);
		
		
	}
	public void Problem6() {
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
	public void Problem7() {
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
	public void Problem8() {
Scanner sc = new Scanner(System.in);
		
		int a=0;
		do{
			a=sc.nextInt();
			if(a>1 && a<50) {
		}else System.out.println("Number is out of range");
		}while(a!=45);
		
		
	}
	public void Problem9() {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			System.out.print(c);
			
		}
		
	}
	public void Problem10() {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int a= sc.nextInt();
		for (int j=1;j<=a;j++) {
			System.out.print(s);
		}
		
		
	}
	
	
		
	}
	
	

