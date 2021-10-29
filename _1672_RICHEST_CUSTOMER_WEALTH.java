class _1672_RICHEST_CUSTOMER_WEALTH {
    public static int maximumWealth(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int max = 0;
        int wealth = 0;
        for (int i = 0; i < row; i++) {
            wealth = 0;
            for (int j = 0; j < col; j++) {
                wealth += a[i][j];
            }
            if (max < wealth)
                max = wealth;
        }
        return max;
    }
}