package inheritance;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class EmployeeClass {
	
	public static String empname="Hari";
	int salary=10;
	
	public int getSalary()
	{
		System.out.println("Salary is "+salary);
		return salary;
	}
	
	public void getBonus(){
		System.out.println("bonus info from parent");
	}
	
	public static void main(String[] args){
		System.out.println("Main method");
		EmployeeClass emp=new EmployeeClass();
		emp.display();
	}
	
	public  void display(){
		int i=getSalary();
		System.out.println("data display method");
		System.out.println(i);
	}
	
	
	

}
