public class ReverseString {

    public static void main(String[] args) {
        String str = "Grid Dynamics";
        System.out.println(reverse(str));
    }

    public static String reverse(String s) {
        if (s == null)
            throw new IllegalArgumentException("Null is not a valid input");
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--)
            sb.append(c[i]);
        return sb.toString();
    }
}
