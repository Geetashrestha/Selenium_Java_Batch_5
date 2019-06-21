package accessModifiers;

import aggregation.Circle;

public class ClassA extends ClassB{
	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.teswt();
		
		ClassB b=new ClassB();
		b.test();
	}

}
