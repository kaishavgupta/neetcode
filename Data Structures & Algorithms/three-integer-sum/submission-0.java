class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        int i = 0;
        while (i < n) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;   // ✅ move forward
                    k--;   // ✅ move backward
                } 
                else if (sum < 0) {
                    j++;
                } 
                else {
                    k--;
                }
            }
            i++;
        }
        return new ArrayList<>(set);
    }
}
