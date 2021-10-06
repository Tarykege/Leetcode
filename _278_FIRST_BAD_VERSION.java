/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//use binary search
public class _278_FIRST_BAD_VERSION {
    public static boolean isBadVersion (int version){
        return true;
    }
    public static int firstBadVersion(int n){
        int left=1,right=n;

        while(left!=right){
            int mid=left+(right-left)/2;
            if(!isBadVersion(mid)){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return right;
    }
}