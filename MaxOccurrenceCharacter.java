import java.util.HashMap;
import java.util.Map;

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
        String input = "abacabad";
        char result = findMaxOccurrence(input);
        System.out.println("Character with maximum occurrence: " + result);
    }

    private static char findMaxOccurrence(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        char maxChar = s.charAt(0);
        int maxCount = 1;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }
}
