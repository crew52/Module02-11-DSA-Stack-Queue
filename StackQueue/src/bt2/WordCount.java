package bt2;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        // Input string
        String text = "This is a test. This test is only a test.";

        // Convert text to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[.,!?]", "");

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a TreeMap to store words and their counts
        Map<String, Integer> wordCountMap = new TreeMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Display the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
