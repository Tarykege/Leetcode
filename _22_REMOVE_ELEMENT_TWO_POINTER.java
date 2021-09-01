public class _22_REMOVE_ELEMENT_TWO_POINTER {
    public static int removeElement2(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }else{
                //nothing
            }
        }
        return k+1;
    }
    public static void main(String[] args) {
        int[] n={2,4,2,3,4,2,1};
        System.out.println(removeElement2(n,2));
        System.out.println("Done");
    }
}
