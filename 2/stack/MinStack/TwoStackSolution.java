class MinStack {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val < minStack.peek()){
        	minStack.push(val);
        }
    }
    
    public void pop() {
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
