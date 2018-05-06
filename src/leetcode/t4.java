package leetcode;
/*
 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。

请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。

示例 1:

nums1 = [1, 3]
nums2 = [2]

中位数是 2.0
示例 2:

nums1 = [1, 2]
nums2 = [3, 4]

中位数是 (2 + 3)/2 = 2.5
 */
public class t4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        for(;i<nums1.length&&j<nums2.length;){
            if(nums1[i]<nums2[j]){
                result[k] = nums1[i];
                i++;
                k++;
            }else{
                result[k] = nums2[j];
                j++;
                k++; 
            }   
        }
        if(i<nums1.length&&k<nums1.length+nums2.length){
            for(;i<nums1.length;i++,k++){
                result[k] = nums1[i];
            }
        }else if(j<nums2.length&&k<nums1.length+nums2.length){
            for(;j<nums2.length;j++,k++){
                result[k] = nums2[j];
            }
        }
        if((nums1.length+nums2.length)%2 == 0){
            return ((double)(result[(nums1.length+nums2.length)/2]+result[(nums1.length+nums2.length)/2-1]))/2;
        }
        else{
            return result[(nums1.length+nums2.length-1)/2];
        }
    }
}
