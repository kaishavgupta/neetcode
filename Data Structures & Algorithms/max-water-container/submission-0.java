class Solution {
    public int maxArea(int[] arr) {
       int n=arr.length;
       int i=0,j =n-1;
       int max=Integer.MIN_VALUE;
       while((i<n && j<n)&&i<j){
        int l = Math.min(arr[i],arr[j]);
        int b = (j-i);
        max=Math.max(max,(l*b));
        if(arr[i]<arr[j]){
            i++;
        }
        else{
            j--;
        }
       }
       return max;
    }
}
