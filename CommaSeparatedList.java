import java.util.ArrayList;

public class CommaSeparatedList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(1000000);
        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if (i < list.size() - 1) {
                result.append(",");
            }
        }
        String output = result.toString();
        System.out.println(output.substring(0, 50));
    }
}
