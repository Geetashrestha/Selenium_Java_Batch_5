import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SecondCommonWord {

	public static void main (String[] args) {
        String filePath = "Macbeth.txt";
        getSecondFreqWord(filePath);

    }

    public static void getSecondFreqWord (String filePath) {

        Map<String, Integer> freqMap = new HashMap<>();


        try {
        	File file = new File(filePath);
        	FileReader fr = new FileReader(file);
        	BufferedReader br = new BufferedReader(fr);
        	String line;
        	String strWord="";
        	while((line = br.readLine()) != null){
        	  String [] strLine=line.split(" ");
        	  
        	  for(int i=0;i<strLine.length;i++){
        		
        		  if(strLine[i].length()>4){
        			  
        			  if(strLine[i].contains("!") || strLine[i].contains(";") || strLine[i].contains(",") || strLine[i].contains(".") || strLine[i].contains(":")){
        				  strWord=strLine[i].substring(0, strLine[i].length() - 1);
        			  }else{
        				  strWord=strLine[i];
        			  }
        			  
        			  
            		  if(freqMap.containsKey(strWord)){
            			  freqMap.put(strWord, freqMap.get(strWord)+1);
            		  }else{
            			  freqMap.put(strWord,1);
            		  }
        			  
        		  }
        		 
        	  }
        	  
        	}
        } catch (IOException e) {
            System.err.println("Issue in reading the file..!");
        }

        //System.out.println(freqMap);
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(freqMap.entrySet());

        // Sort the list
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        int i = 1, j = 2;
        do {
            System.out.println("Second Frequent Word : " + list.get(i).getKey() + " with occurences : " + list.get(i).getValue());
            i=j; j++;
        } while (list.get(i) == list.get(j));


    }

}
