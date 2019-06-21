
public class ThisKeywordExample extends ParentClass{

	String name;
	int id;
	
	public ThisKeywordExample(String name,int id){
		this();
		this.name=name;
		this.id=id;
	}
	
	public ThisKeywordExample() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void show(){
		display();
		display();
	
	}
	
	public void display(){
		System.out.println("This is my child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordExample t1=new ThisKeywordExample();
		
		t1.show();
		
	}

}
