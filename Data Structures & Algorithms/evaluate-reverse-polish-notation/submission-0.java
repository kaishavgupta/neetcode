class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].length() > 1 || Character.isDigit(tokens[i].charAt(0))) {

                stack.push(Integer.parseInt(tokens[i]));

            } else {

                char c = tokens[i].charAt(0);

                int x = stack.pop();
                int y = stack.pop();

                if (c == '+') {
                    stack.push(y + x);
                } 
                else if (c == '-') {
                    stack.push(y - x);
                } 
                else if (c == '*') {
                    stack.push(y * x);
                } 
                else { 
                    stack.push(y / x);
                }
            }
        }

        return stack.pop();
    }
}
