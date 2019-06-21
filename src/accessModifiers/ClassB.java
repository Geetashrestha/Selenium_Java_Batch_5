package accessModifiers;

public class ClassB {
	
	
	private void test(){
		System.out.println("this is my private method");
	}

	
	public static void main(String[] args) {
		ClassDefault d=new ClassDefault();
		d.display();
	}
}
