package inheritance;

public class Programmer extends EmployeeClass{
	static String empname="Haria";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer  p=new Programmer();
		
		//p.getSalary();	
		
		p.show();
		
	}


	public int getSalary(){		
		
		Programmer  p=new Programmer();
		p.salary=super.getSalary()+200;
		System.out.println("salary of a programmer is"+(p.salary));
		return p.salary;
	}
	
	
	public void show(){
		super.getSalary();
		this.getSalary();
	}
	
	

}
