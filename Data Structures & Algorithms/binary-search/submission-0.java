class Solution {
    public int search(int[] arr, int target) {
        int s=arr.length;
        int l=0, h=s;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                h--;
            }
            else{
                l++;
            }
        }
        return -1;
    }
}
