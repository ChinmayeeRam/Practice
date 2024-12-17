import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aabccd";
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            output.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
        }
        if (output.length() > 0) {
            output.setLength(output.length() - 1);
        }
        System.out.println(output);
    }
}