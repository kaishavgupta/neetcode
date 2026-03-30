// Two pointer solution
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        int res=0;
        while(start<end){
            res=numbers[start]+numbers[end];

            if(res==target){
                return new int[]{start+1,end+1};
            }

            else if(res<target){
                start++;
                res=numbers[end];
            }

            else{
                end--;
                res=numbers[start];
            }
        }
         return new int[]{-1, -1};
    }
}
