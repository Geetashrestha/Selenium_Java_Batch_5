package stringExample;

public class StringEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Sachin";
		String s2="SACHIN";
		
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1 and s2 both are equal");
		}else{
			System.out.println("s1 and s2 both are not equal");
		}
		
		if(s1.equals(s2)){
			System.out.println("s1 and s2 both are equal");
		}else{
			System.out.println("s1 and s2 both are not equal");
		}
		
		
		String firstName="Hari";
		String LastName="Gupta";
		
		String name=firstName.concat(LastName);
		
		String fullName=firstName+" "+LastName;
		
		String s="Hari";
		
		String sum=s+1+2;
		
		String sum1=1+2+s;
		
		System.out.println(sum);
		
		System.out.println(sum1);
		
		
		
		
	}

}
