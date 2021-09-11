public class _387_FIRST_UNIQUE_CHARACTER_IN_A_STRING{
    public static int firstUniqChar(String s) {
        char[] arr= s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            int charInt= (int) arr[i];
            count[charInt]++;
        }
        for (int i = 0; i < arr.length; i++) {
            int charInt= (int) arr[i];
            if(count[charInt]==1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}