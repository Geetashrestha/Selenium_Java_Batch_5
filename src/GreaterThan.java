import java.util.Scanner;

public class GreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter second Number");
		int b=sc.nextInt();
		System.out.println("Enter third Number");
		int c=sc.nextInt();
		
		
		if(a>b && a>c){
			System.out.println("a is greater");
		}else if(b>c && b>a){
			System.out.println("b is greater");
		}else{
			System.out.println("c is greater");
		}
		
		if(a>30){
			System.out.println("a is greater than 30");
		}else if(a>20){
			System.out.println("a is  greater than 20");
		}else{
			System.out.println("a is not greater than 20 and 30");
		}
		

	}
	
	
	
	// > - greater than
	// < - less than
	// >= - greater than and equal to
	// <= - less than or eual to
	// == - equal to

}
