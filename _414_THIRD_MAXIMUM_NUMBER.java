public class _414_THIRD_MAXIMUM_NUMBER {
    public static int solution(int[] nums) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

        for (int i = 0; i < nums.length; i++) {
            insert(nums[i], maxArr);
        }

        if (maxArr[2] != Long.MIN_VALUE) {
            return (int) maxArr[2];
        } else
            return (int) maxArr[0];
    }

    private static void insert(int val, long[] maxArr) {
        int i = 0;
        while (i < maxArr.length) {
            if (val == maxArr[i]) {
                break;
            } else if (val > maxArr[i]) {
                for (int j = maxArr.length - 2; j >= i; j--) {
                    maxArr[j + 1] = maxArr[j];
                }
                maxArr[i] = val;
                break;
            } else if (val < maxArr[i]) {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2 };
        System.out.println(solution(a));
    }

}