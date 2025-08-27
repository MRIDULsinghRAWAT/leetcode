class MinStack {
/**push(val) → Push element.
pop() → Remove top element.
top() → Get top element.
getMin() → Retrieve the minimum element in O(1) time. */

/**  // private - minstack wali clss mei hi access hoga bss
        // stack - this is main stack to push pop wagera
        // minstrack - minimus walk stack track karega 
   
     */
 private Stack<Integer> stack;
    private Stack<Integer> minStack; 
    

    public MinStack() {
        // yeh khud likhna h 
        stack =new Stack<>();
        minStack=new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        //
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
         minStack.push(Math.min(val,minStack.peek()));
        }// yhe tab use hoga jab stack is not empty
    }//Math.min(val, minStack.peek()) → naya minimum calculate karta hai (ya toh naya val, ya purana minimum).
    
    public void pop() {
       stack.pop();
       minStack.pop(); // minimum kia pop  
    }
    
    public int top() {
     return stack.peek();   
    }
    
    public int getMin() {
       return minStack.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
