import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

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
	
		}
		
		
	


