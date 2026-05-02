class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        //    stack.push(-1);

        int n = heights.length, area = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            int curr = (i == heights.length) ? Integer.MIN_VALUE : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > curr) {
                int midheight = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                area = Math.max(area, midheight * w);
            }
            stack.push(i);
        }
        return area;
    }
}
