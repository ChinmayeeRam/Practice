public class CountPunctuation {
    public static void main (String args[])
    {
        int count = 0;
        String str = "Wow, that was amazing!";
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
            {
                count++;
            }
        }
        System.out.println("The number of punctuations exists in the string is: " +count);
    }
}
