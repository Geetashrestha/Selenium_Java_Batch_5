

public class VariableExample {

	int a=10;
	static int b=20;
	public void display(){
		int a=10;
		int b=20;
		System.out.println(a);
	}
	
public static void main(String[] args) {
	System.out.println(b);
	
	VariableExample v=new VariableExample();
	System.out.println(v.a);
	v.display();

	VariableExample v1=new VariableExample();
	v1.display();
}

// static method : with static keyword 
// non static method : without static keyword

// non static variable / Instance variable - variable without static keyword
// static variable : variable with static keyword
}
