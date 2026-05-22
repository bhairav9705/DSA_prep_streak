import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
  public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : strs) {
            char[] words = word.toCharArray();
            Arrays.sort(words);
            String sortedWord = new String(words);

            if(!map.containsKey(sortedWord)) map.put(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
