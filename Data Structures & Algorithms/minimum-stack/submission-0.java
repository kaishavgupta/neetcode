class MinStack {
    List<Integer> stack;
    int pointer;
    public MinStack() {
        pointer =-1;
        stack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        pointer++;
    }
    
    public void pop() {
        stack.remove(pointer);
        pointer --;
    }
    
    public int top() {
        return stack.get(pointer);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
    for (int i = 0; i <= pointer; i++) {
        min = Math.min(min, stack.get(i));
    }
    return min;
    }
}
