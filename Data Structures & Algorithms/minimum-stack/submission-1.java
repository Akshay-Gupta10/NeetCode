class MinStack {
    Stack<Integer> stk;
    Stack<Integer> min;

    public MinStack() {
        stk=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty() || min.peek()>=val){
            min.push(val);
        }
    }
    
    public void pop() {
        int top=stk.pop();
        if(min.peek()==top){
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
