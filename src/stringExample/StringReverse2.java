package stringExample;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hari";
		//iraH
		String rev="";
		
		int sLength=s.length();
		
		for(int i=sLength-1;i>=0;i--){
			char c=s.charAt(i);
			rev=rev+String.valueOf(c);
			
		}
		
		System.out.println(rev);
	}

}
