import java.util.Arrays;

public class _977_SQUARES_OF_A_SORTED_ARRAY {
    public static int[] sortedSquares(int[] a) {
        int n = a.length;
        int i = 0, j = n - 1, k = j;
        int[] res = new int[n];

        while (i <= j) {
            if (Math.abs(a[i]) < Math.abs(a[j])) {
                res[k--] = a[j] * a[j];
                j--;
            } else if (Math.abs(a[i]) >= Math.abs(a[j])) {
                res[k--] = a[i] * a[i];
                i++;
            } else if (i == j) {
                res[k--] = a[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
}