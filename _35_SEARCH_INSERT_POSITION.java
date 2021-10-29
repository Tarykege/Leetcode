public class _35_SEARCH_INSERT_POSITION {
    public static int searchInsert(int[] a, int tar) {
        int l = 0;
        int r = a.length - 1;
        int m = 0;

        while (l <= r) {
            m = l + (r - l) / 2;
            if (a[m] == tar)
                return m;
            else if (a[m] > tar) {
                r = m - 1;
            } else if (a[m] < tar) {
                l = m + 1;
            }
        }
        if (r < 0)
            return 0;
        else if (l > a.length - 1)
            return a.length;
        else if (a[m] > tar)
            return m;
        else
            return m + 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6 };
        System.out.println(searchInsert(a, 2));
    }
}