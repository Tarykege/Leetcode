/**
 * _283_MOVE_ZEROES
 */
import java.util.Arrays;
public class _283_MOVE_ZEROES {
    public static void moveZeroes(int[] a) {
        
        for (int lastNonZeroFoundAt = 0, i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int t = a[i];
                a[i] = a[lastNonZeroFoundAt];
                a[lastNonZeroFoundAt++] = t;
            }
        }

    }
    public static void main(String[] args) {
        int[] a = { 0, 0, 1 };
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}