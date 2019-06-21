package methodOverloading;

public class Area {
	
	
	public int area(int a){
		int c=a*a;
		return c;
	}

	

	public int area(int a, int b){
		int c=a*b;
		return c;
	}
	
	public int area(double a, double b){
		int c=(int) ((int)a*b);
		return c;
	}
	
	
	public void area(int a, float b){
		int c=(int) ((int)a*b);
		
	}
	
	
	public double area(double r){
		double c=3.14*r*r;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a=new Area();
		int sqArea=a.area(10);
		System.out.println(sqArea);
		
		int rectArea=a.area(10,20);
		System.out.println(rectArea);
		
		double cirArea=a.area(5.3);
		
		System.out.println(cirArea);
		
		
		
	}
	
	public static void main(){
		
	}
	
	public static void main(int a){
		
	}

}
