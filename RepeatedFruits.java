import java.util.HashMap;
import java.util.Map;

public class RepeatedFruits {
    public static void main(String[] args) {
        String fruits = "Apple,Banana,Apple,Cherry,Banana,Apple,Cherry";
        countRepeatedFruits(fruits);
    }

    private static void countRepeatedFruits(String fruits) {
        String[] fruitArray = fruits.split(",");
        Map<String, Integer> fruitCount = new HashMap<>();
        for (String fruit : fruitArray) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }
        System.out.println("Repeated fruits:");
        for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

