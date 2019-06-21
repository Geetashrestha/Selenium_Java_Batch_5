import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordCountFreq {

    public static void main (String[] args) {
        String filePath = "Macbeth.txt";
        getSecondFreqWord(filePath);

    }

    public static void getSecondFreqWord (String filePath) {

        Map<String, Integer> freqMap = new HashMap<>();

        List<Character> punctuations = Arrays.asList('!', ',', '.', '?',';');

        try {
            Files.lines(Paths.get(filePath))
                    .forEach(
                            line -> {
                                //System.out.println("line = " + line);
                                Arrays.stream(line.split(" "))
                                        .filter(word -> word.length() > 4)
                                        .map(word -> punctuations.contains(word.charAt(word.length() - 1)) ? word.substring(0, word.length() - 1) : word)
                                        .forEach(word -> {
                                            freqMap.merge(word, 1, (oldV, newV) -> oldV + newV);
                                        });
                            });
        } catch (IOException e) {
            System.err.println("Issue in reading the file..!");
        }
        System.out.println(freqMap);
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
