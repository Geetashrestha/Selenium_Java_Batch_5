package arrayExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abchdfbceabcde";
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<s.length();i++){
			
		char c=s.charAt(i);
		
		String s1=String.valueOf(c);
		
		if(!map.containsKey(s1)){
			map.put(s1, 1);
		}else{
			map.put(s1, map.get(s1)+1);
		}

	}
		
		System.out.println(map);
		
		for(Entry<String, Integer> e : map.entrySet()){
			
			if(e.getValue()>1){
				System.out.println(e.getKey()+ " is repeating "+e.getValue() +" times");
				
			}
			
		}

	}
}
