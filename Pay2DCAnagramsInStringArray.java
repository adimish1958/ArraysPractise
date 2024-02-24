//Pay2dc first round interview question
import java.util.*;

public class Pay2DCAnagramsInStringArray {
    public static Map<String, List<String>> findAnagrams(String[] words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            if (anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            } else {
                List<String> wordList = new ArrayList<>();
                wordList.add(word);
                anagrams.put(sortedWord, wordList);
            }
        }
        
        // Remove entries with only one word (not an anagram)
        anagrams.entrySet().removeIf(entry -> entry.getValue().size() <= 1);
        
        return anagrams;
    }
    
    public static void main(String[] args) {
        String[] wordArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagrams = findAnagrams(wordArray);
        
        for (List<String> anagramGroup : anagrams.values()) {
            System.out.println(anagramGroup);
        }
    }
}
