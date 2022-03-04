class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < nums2.length ; i++){
            nums1[m + i] = nums2[i];
        }
        
        System.out.println(Arrays.toString(nums1)) ;
        Arrays.sort(nums1) ;
    }
}