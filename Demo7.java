import java.util.HashMap;
import java.util.Map;

public class Demo7 {
        public static void main(String[] args) {
            System.out.println(SearchingChallenge("3aabacbebebe")); // Output: cbebebe
            System.out.println(SearchingChallenge("2aabbcbbbadef")); // Output: bbcbbb
        }

        static String SearchingChallenge(String str) {
            int k = Character.getNumericValue(str.charAt(0));
            int n = str.length();

            int start = 1; // Start from the second position
            int maxLen = 0;
            int maxLenStart = 1;

            Map<Character, Integer> charCount = new HashMap<>();

            for (int end = 1; end < n; end++) {
                char currentChar = str.charAt(end);

                // Update character count in the map
                charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

                // Shrink the window if unique characters exceed k
                while (charCount.size() > k) {
                    char startChar = str.charAt(start);
                    charCount.put(startChar, charCount.get(startChar) - 1);

                    if (charCount.get(startChar) == 0) {
                        charCount.remove(startChar);
                    }

                    start++;
                }

                // Update max length and starting index of the longest substring
                if (end - start + 1 > maxLen) {
                    maxLen = end - start + 1;
                    maxLenStart = start;
                }
            }

            return str.substring(maxLenStart, maxLenStart + maxLen);
        }
    }
