package aggregation;

import accessModifiers.ProtectedClassA;

public class Circle extends ProtectedClassA{
	
	public static void main(String[] args) {
		Operation op=new Operation();
		int r=10;
		double c=op.circleArea(r);
		System.out.println(c);
		
		Circle e=new Circle();
		e.display();
		
	}
	
	

}
