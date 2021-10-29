class _27_REMOVE_ELEMENT {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                int j = i;

                while (j < n - 1) {
                    nums[j] = nums[j + 1];
                    j++;
                }
                n--;
            } else
                i++;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] n = { 0, 1, 2, 2, 3, 0, 4, 2 };
        System.out.println(removeElement(n, 2));
        System.out.println("done");
    }
}