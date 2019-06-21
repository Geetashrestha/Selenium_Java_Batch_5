
public class ABC {

	int c;
	String b;
	static String collegename="ABC";
	
	public ABC(int d,String e){
		c=d;
		b=e;
	}
	
	public ABC(){
		
	}
	
	
	public ABC(String d,int e){
	
	}
	
	
	public ABC(String d,int e,int c){
		
	}
	
	
	public void display(){
		System.out.println(c+"  "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a=new ABC();
		System.out.println(a.c +" "+a.b);
		
		ABC a1=new ABC(2,"Hari");
		a1.display();
		
			ABC a2=new ABC(3,"Anil");
			a2.display();
			
			System.out.println(collegename);
			
			
sum();
		
	}
	
	public static void sum(){
		int num1=10;
		int num2=20;
		int num3=num1+num2;
		System.out.println(num3);
	}

}
