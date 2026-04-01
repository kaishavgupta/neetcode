class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        int min=arr[0];
        while(l<=r){
            if(arr[l]<arr[r]){
                min=Math.min(min,arr[l]);
                break;
            }
            int mid=(l+r)/2;
            min=Math.min(min,arr[mid]);
     

            if(arr[mid]>=arr[l]){
                
                l=mid+1;
            }

            else{
                
                r=mid-1;
            }
         
    
        }
        return min;
    }
}