import java.util.Arrays;

/**
 * _189_RORATE_ARRAY O(2n) Runtime: 1 ms, faster than 69.03% of Java online
 * submissions for Rotate Array. Memory Usage: 56.1 MB, less than 66.23% of Java
 * online submissions for Rotate Array.
 */
public class _189_RORATE_ARRAY {
    public static void rotate(int[] a, int k) {
        int n = a.length, i = 0, j = 0;
        int[] res = new int[n];
        k = n - (k % n);

        while (j < n) {
            if (k < n) {
                res[j] = a[k++];
            } else if (i < k) {
                res[j] = a[i++];
            }
            j++;
        }

        for (int l = 0; l < res.length; l++) {
            a[l] = res[l];
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }
}