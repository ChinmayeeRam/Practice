import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedNumber {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 2, 3, 4, 1, 2};
        int result = findMaxRepeatedNumber(input);
        System.out.println("Max repeated number is: " + result);
    }

    private static int findMaxRepeatedNumber(int[] input) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : input) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxRepeatedNumber = input[0];
        int maxCount = frequencyMap.get(maxRepeatedNumber);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxRepeatedNumber = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxRepeatedNumber;
    }
}
