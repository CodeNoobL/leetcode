package leetcode;
/*
 ����������СΪ m �� n ���������� nums1 �� nums2 ��

���ҳ������������������λ����Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log (m+n)) ��

ʾ�� 1:

nums1 = [1, 3]
nums2 = [2]

��λ���� 2.0
ʾ�� 2:

nums1 = [1, 2]
nums2 = [3, 4]

��λ���� (2 + 3)/2 = 2.5
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
