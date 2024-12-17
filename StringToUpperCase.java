public class StringToUpperCase {
    public static void main(String[] args) {
        String input = "Hello World!";
        String uppercaseString = convertToUppercase(input);
        System.out.println("Converted to Uppercase: " + uppercaseString);
    }

    private static String convertToUppercase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);  // Convert to uppercase by subtracting 32
            }
            result.append(c);
        }
        return result.toString();
    }
}
