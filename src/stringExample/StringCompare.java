package stringExample;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hari";
		String s4="Hari";
		String s2=new String("Hari");
		String s3=new String("Hari");
		// == => Compare reference variable
		
	//equals => Method compares the value
		
		if(s1==s2){
			System.out.println("both Strings are equal");
		}else{
			System.out.println("both Strings are not equal");
		}
		
		if(s1.equals(s2)){
			System.out.println("s1 and s2 both Strings are equal");
		}else{
			System.out.println("s1 and s2 both Strings are not equal");
		}
		

		if(s2==s3){
			System.out.println("both Strings are equal");
		}else{
			System.out.println("both Strings are not equal");
		}
		
		
		if(s2.equals(s3)){
			System.out.println("s2 and s3 both Strings are equal");
		}else{
			System.out.println("s2 and s3 both Strings are not equal");
		}
		

		
		if(s1==s4){
			System.out.println("both Strings are equal");
		}else{
			System.out.println("both Strings are not equal");
		}
	}

}
