class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];

            if(map.containsKey(difference)){
               list.add(map.get(difference));
               list.add(i);
               break;
            }

            else{
                map.put(nums[i],i);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
