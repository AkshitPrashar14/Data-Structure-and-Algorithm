class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[]=new int[nums1.length+nums2.length];
        int m=nums3.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }else{
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            nums3[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            nums3[k]=nums2[j];
            k++;
            j++;
        }
        double median=0;
        if(m%2==1){
            median=nums3[m/2];
        }else{
            median=(double)(nums3[m/2-1]+nums3[m/2])/2;
        }
        return median;
    }
}
