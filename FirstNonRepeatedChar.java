import java.util.HashMap;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "hello";
        char result = firstNonRepeatedChar(s);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    private static char firstNonRepeatedChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
}
