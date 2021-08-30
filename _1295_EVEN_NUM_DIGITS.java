class _1295_EVEN_NUM_DIGITS {
    public static int findNumbers(int[] nums) {
        int count=0;

        for (int ai : nums) {
            if(numDigit(ai)%2==0) count++;
        }
        return count;
    }
    private static int numDigit(int ai) {
        int x=ai;
        int cDigit=0;

        while(x>0){
            x=x/10;
            cDigit++;
        }
        return cDigit;
    }
    public static void main(String[] args) {
        int[] n = {123, 14, 666, 444};
        System.out.println(findNumbers(n));
    }
}