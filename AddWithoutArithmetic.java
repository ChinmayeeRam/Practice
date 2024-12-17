public class AddWithoutArithmetic {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int result = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
