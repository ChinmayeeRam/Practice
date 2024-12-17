public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "I love Programming";
        String result = reverseSentence(sentence);
        System.out.println(result);
    }

    private static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }
}
