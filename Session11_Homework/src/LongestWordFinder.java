public class LongestWordFinder {
    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog";
        String longestWord = findLongestWord(input);

        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String input) {
        String[] words = input.split("\\W+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
}
