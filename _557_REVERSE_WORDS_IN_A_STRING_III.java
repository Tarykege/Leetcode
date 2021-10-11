public class _557_REVERSE_WORDS_IN_A_STRING_III {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            res.append(new StringBuilder(word).reverse() + " ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "hello every one";
        System.out.println(reverseWords(s));
    }
}
