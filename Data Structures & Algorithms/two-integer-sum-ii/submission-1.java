class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int res[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++){
            int v=target-numbers[i];
            
            if(!(map.containsKey(v))){
                map.put(numbers[i],i+1);
            }

            else{
                res[0]=map.get(v);
                res[1]=i+1;
                break;                
            }
        }
        return res;
    }
}
