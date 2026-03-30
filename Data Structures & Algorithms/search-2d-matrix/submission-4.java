class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        for(int i=0;i<r;i++){
            int c=matrix[i].length;
            int l=0,h=c-1;
            while(l<=h){
                 int mid=(l+h)/2;
            if( matrix[i][mid]==target){
                return true;
            }
            else if(matrix[i][mid]>target){
                h--;
            }
            else{
                l++;
            }
            }
        }
        return false;
    }
}
