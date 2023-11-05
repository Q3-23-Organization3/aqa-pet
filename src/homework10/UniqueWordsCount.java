package homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordsCount {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Candle");
        words.add("candle");
        words.add("Candle");
        words.add("Autumn");
        words.add("autumn");
        words.add("The");
        words.add("the");

        Map<String, Integer> wordToCountMap = new HashMap<>();

        for (String word : words) {
            wordToCountMap.put(word, 0);
        }

        String text = "The candle flickered gently , casting a warm , inviting glow in the cozy autumn cabin ." +
                " As the autumn leaves rustled outside , the candle's flame danced , creating a mesmerizing display of light and shadow ." +
                " The fragrance of the autumn candle filled the room , making it a perfect evening to savor the beauty of the season .";
        String[] wordsInText = text.split(" ");

        for (String word : wordsInText) {
            if (wordToCountMap.containsKey(word)) {
                wordToCountMap.put(word, wordToCountMap.get(word) + 1);
            }
        }

        for (String uniqueWord : wordToCountMap.keySet()) {
            int counter = wordToCountMap.get(uniqueWord);
            System.out.println("'" + uniqueWord + "'" + " repeats " + counter + " times");
        }
    }
}
