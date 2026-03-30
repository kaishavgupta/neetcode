public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count =1,maxCount=0,v;
        if(nums.length!=0){
        for(int e:nums){
            set.add(e);
        }
        
        for(int e:set){
            if(!set.contains(e-1)){
                v=e+1;
                while(set.contains(v)){
                    count++;
                    v++;
                }
                
                maxCount=Math.max(maxCount,count);
                count=1;
            }
        }}
        return maxCount;
    }
}