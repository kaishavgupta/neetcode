class Solution {
    public boolean isValid(String s) {
        char []arr=s.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push('/');
        for(char c:arr){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }

            else{
                if(c==']' && stack.peek()!='[') return false;
                else if(c=='}' && stack.peek()!='{') return false;
                else if(c==')' && stack.peek()!='(') return false;
                else stack.pop();
            }
        }

        if(stack.peek()=='/'){
            return true;
        }
        else{
            return false;
        }
    }
}
