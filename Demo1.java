import java.util.List;
import java.util.Arrays;

public class Demo1 {
    public static boolean canFormWord(String word, List<String> wordList) {
        // Create a boolean array to track if each character in the word is covered
        boolean[] dp = new boolean[word.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= word.length(); i++) {
            for (String str : wordList) {
                int len = str.length();
                if (i >= len && dp[i - len] && word.substring(i - len, i).equals(str)) {
                    dp[i] = true;
                    break;
                }
            }}
        return dp[word.length()];
    }
    public static void main(String[] args) {
        
        List<String> wordList = Arrays.asList("i", "likes", "siva", "salad", "bikes", "icecream");

        String testWord = "test";
        String word1 = "siva";
        String word2 = "likesbikessiva";
        String word3 = "sivalikesbikestest";

        System.out.println(testWord + " > " + (canFormWord(testWord, wordList) ? "Yes" : "No"));
        System.out.println(word1 + " > " + (canFormWord(word1, wordList) ? "Yes" : "No"));
        System.out.println(word2 + " > " + (canFormWord(word2, wordList) ? "Yes" : "No"));
        System.out.println(word3 + " > " + (canFormWord(word3, wordList) ? "Yes" : "No"));
    }
}
