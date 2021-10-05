/**
 * _704_BINARY_SEARCH
 */
public class _704_BINARY_SEARCH {
    public static int search(int[] a, int key){
        int left=0;
        int right=a.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2; 
            System.out.println("["+ left+","+right+"] xet "+mid);
            if(a[mid]==key) return mid;
            else if(a[mid]<key){
                left=mid+1;
            }
            else if(a[mid]>key){
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={-1,0,3,5,9,12};
        System.out.println(search(a,-1));
    }
}