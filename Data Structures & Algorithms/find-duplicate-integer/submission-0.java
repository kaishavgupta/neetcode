/*
    BruteForce method to solve easily and quickly
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int k=nums.length;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length && j!=i;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
