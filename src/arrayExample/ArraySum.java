package arrayExample;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int i=0;i<a.length;i++){	
			System.out.println(i + ":"+ a[i]);
			sum=sum+a[i];
			System.out.println(sum);
		}
		
		System.out.println(sum);
	}

}
