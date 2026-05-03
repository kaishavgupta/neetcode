// Negative Marking

class Solution {
    public int findDuplicate(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                d=nums[i];
                break;
            }
            nums[Math.abs(nums[i])-1]*=-1;
        }
        return Math.abs(d);
    }
}
