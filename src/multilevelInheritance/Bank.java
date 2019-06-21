package multilevelInheritance;

public class Bank {
	int interestRate=0;
	public Bank(){
		System.out.println("Parent class constructor");
	}
	
	public void getInterestRate(){
		System.out.println("Interest rate is 8%");
	}

	
	public void getCarLoanrate(){
		System.out.println("Home loan rate is 7");
	}
	
	
	public void getHomeLoanrate(){
		System.out.println("Home loan rate is 8");
	}
	
	
	public static void main(String[] args) {
		Bank b=new Bank();
		b.getInterestRate();
	}
}
