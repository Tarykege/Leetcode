import java.util.Arrays;

/**
 * _167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED
 */

public class _167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED {
    public static int[] twoSum(int[] a, int target) {
        int[] index = new int[2];
        int i = 0, j = a.length - 1;

        while (i < j) {
            int sum = a[j] + a[i];
            if (sum == target) {
                index[0] = i + 1;
                index[1] = j + 1;
                break;
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4 };
        System.out.println(Arrays.toString(twoSum(a, 6)));
    }
}