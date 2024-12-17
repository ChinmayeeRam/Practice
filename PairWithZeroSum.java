import java.util.HashSet;
import java.util.Set;

public class PairWithZeroSum {
    public static void main(String[] args) {
        int[] input = {3, 1, -1, 4, -3, 2, -2};
        findPairsWithZeroSum(input);
    }

    private static void findPairsWithZeroSum(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(-num)) {
                System.out.println("Pair with zero sum: (" + num + ", " + (-num) + ")");
            }
            seen.add(num);
        }
    }
}
