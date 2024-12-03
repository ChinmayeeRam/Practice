public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcde", s2 = "deabc";

        if (s1.length() != s2.length()) {
            System.out.println("Second string is not a rotation of first string");
        } else {
            //Concatenate str1 with str1 and store it in str1
            s1 = s1.concat(s1);
            //Check whether str2 is present in str1
            if (s1.indexOf(s2) != -1)
                System.out.println("Second string is a rotation of first string");
            else
                System.out.println("Second string is not a rotation of first string");
        }
    }
}