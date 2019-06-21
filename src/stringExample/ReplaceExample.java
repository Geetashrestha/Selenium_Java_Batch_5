package stringExample;

public class ReplaceExample {
	
	public static void main(String[] args) {
		String s="abc--cde--fgh";
		
		s=s.replaceAll("--", "#");
		System.out.println(s);
		
	}

}
