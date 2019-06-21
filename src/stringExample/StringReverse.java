package stringExample;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hari";
		//iraH
		String rev="";
		char[] charac=s.toCharArray();
	
		int arrLength=charac.length;
		System.out.println(arrLength);
		
		for(int i=arrLength-1;i>=0;i--){
			System.out.println("index :"+i);
			System.out.println(charac[i]);
			rev=rev+charac[i];
			System.out.println("rev :"+rev);
		}
		
		System.out.println(rev);

	}

}
