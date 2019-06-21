package multilevelInheritance;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ICICIBank extends RBIBank{
	
	public ICICIBank(){
		super();
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ICICIBank i=new ICICIBank();
		 i.getInterestRate();
	
		 i.getCarLoanrate();
		 i.getHomeLoanrate();
		
		 
		 
	

	}
	
	
	public void getInterestRate(){
		super.g
		super.getInterestRate();
		System.out.println("Interest rate 9%");
		System.out.println(super.interestRate);
	}

}
