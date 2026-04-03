class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int []numarr=new int[n];

   
            for(int i=0;i<n1;i++){
                numarr[i]=nums1[i];
            }
            for(int i=0;i<n2;i++){
                numarr[n1+i]=nums2[i];
            }
   
        Arrays.sort(numarr);

        if(n%2==0){
            int mid=(n/2)-1;
            int m1=numarr[mid];
            int m2=numarr[mid+1];
            double median=(double)(m1+m2)/2;
            return median;
        }

        else{
            return (double)numarr[n/2];
        }

    }
}