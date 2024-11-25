public class DuplicateCharacter {
    public static void main(String[] args) {
        String s = "Grid Dynamics";
        int count;

        //Converts given string into character array
        char str[] = s.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < str.length; i++) {
            count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j] && str[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    str[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && str[i] != '0')
                System.out.println(str[i]);
        }
    }


}
