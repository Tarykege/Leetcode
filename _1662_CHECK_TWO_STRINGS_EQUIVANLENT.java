public class _1662_CHECK_TWO_STRINGS_EQUIVANLENT {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();
        for (String s : word1) {
            r1.append(s);
        }
        for (String s : word2) {
            r2.append(s);
        }
        return r1.toString().equals(r2.toString());
    }

    public static void main(String[] args) {
        String[] s1 = { "abc", "d" };
        String[] s2 = { "a", "bc", "d" };
        System.out.println(arrayStringsAreEqual(s1, s2));
    }
}