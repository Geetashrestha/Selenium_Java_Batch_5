package arrayExample;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c=new char[10];
		
		String[] s=new String[5];
		
		
		int[][] a=new int[4][4];
		
		int[][] a1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		System.out.println(a1[0][0]);
		System.out.println(a1[1][3]);
		System.out.println(a1[3][3]);
		
		for(int i=0;i<4;i++){
			System.out.println("row index : "+i);
			for(int j=0;j<4;j++){
				System.out.println("column index : "+j);
				System.out.println(a1[i][j]);
			}
		}
		

	}

}
