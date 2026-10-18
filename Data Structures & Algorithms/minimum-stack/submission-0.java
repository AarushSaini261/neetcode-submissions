class MinStack {
    Stack<Integer>stk;
    Stack<Integer>min;
    public MinStack() {
    	 stk=new Stack<>();
    	 min=new Stack<>();
    	 min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.peek()>=val) {
        	min.push(val);
        }
    }
    
    public void pop() {
    	int removed = stk.peek();
    	stk.pop();
    	if (removed==min.peek()) {
    	    min.pop();
    	}
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
    	return min.peek();
    }
}