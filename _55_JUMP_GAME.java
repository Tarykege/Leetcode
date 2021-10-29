public class _55_JUMP_GAME {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxPath = 0;
        for (int i = 0; i < n; i++) {
            maxPath = Math.max(maxPath, i + nums[i]);
            if (maxPath >= n - 1)
                return true;
            else if (maxPath < i + 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 0 };
        System.out.println(canJump(a));
    }

}