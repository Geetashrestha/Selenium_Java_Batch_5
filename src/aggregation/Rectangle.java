package aggregation;

public class Rectangle extends Operation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		Operation op=new Operation();
		int c=op.area(a, b);
		
		System.out.println(c);
		Operation r=new Rectangle();
		r.area(2, 3);

	}


}
