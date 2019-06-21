package multilevelInheritance;

public class RBIBank extends Bank{

	
	public void getHomeLoanrate(){
		System.out.println("Home loan rate is 8.5");
	}
	
	public void getCarLoanrate(){
		System.out.println("Home loan rate is 9");
	}
	
	public void getInterestRate(){
		System.out.println("Interest rate is 7.5%");
	}

	
	
	public static void main(String[] args) {
		RBIBank r=new RBIBank();
		r.getHomeLoanrate();
		r.getCarLoanrate();
	}
}
