class Solution {

    public int[] keyValue(HashMap<Integer, Integer> map) {

        int[] max = {Integer.MIN_VALUE, 0}; 
        // max[0] = frequency
        // max[1] = number

        for (int key : map.keySet()) {
            if (map.get(key) > max[0]) {
                max[0] = map.get(key);
                max[1] = key;
            }
        }
        return max;
    }

    public int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: build frequency map
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                int val = map.get(i);
                val += 1;
                map.put(i, val);
            }
        }

        // Step 2: pick top k elements
        for (int i = 0; i < k; i++) {
            int[] max = keyValue(map);
            list.add(max[1]);          // store the element
            map.remove(max[1]);       // remove so next max can be found
        }

        // Step 3: convert to int[]
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
