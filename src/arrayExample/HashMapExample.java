package arrayExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"Hari");
		map.put(2, "ABC");
		map.put(3, "ABC");
		map.put(3, "XYZ");
		
	System.out.println(map.get(3));
	}

}
