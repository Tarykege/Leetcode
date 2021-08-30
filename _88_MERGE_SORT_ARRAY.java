class _88_MERGE_SORT_ARRAY {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i : nums2) {
                insert(i,nums1,m);
                m++;
            }
        }
        private static void insert(int nums2i, int[] nums1, int m) {
            // boolean found=false;
            // for(int i=0; i<m; i++){
            //     if(nums1[i]>nums2i) {
            //         found=true;
            //         for(int j=m-1; j>=i; j--){
            //             nums1[j+1]=nums1[j];
            //         }
            //         nums1[i]=nums2i;
            //         break;
            //     }
            // }
            // if (!found) nums1[m]= nums2i; 
            //cach nay nhanh hon
            boolean found=false;
            int i=0;
            while(found==false && i<=m-1){
                if(nums1[i]>nums2i) {
                    found=true;
                    for(int j=m-1; j>=i; j--){
                        nums1[j+1]=nums1[j];
                    }
                    nums1[i]=nums2i;
                }
                i++;
            }
            if (!found) nums1[m]= nums2i; 
        }
    public static void main(String[] args) {
        int[] n1= {4,5,6,0,0,0};
        int[] n2= {1,2,3};
        merge(n1, 3, n2, 3);
        System.out.println("DONE");
    }
}