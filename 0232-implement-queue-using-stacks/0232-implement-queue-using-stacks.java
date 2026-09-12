class MyQueue {
     Stack<Integer> st =  new Stack<>();
     Stack<Integer> helper =  new Stack<>();
    public MyQueue() {

    }
    
    public void push(int x) {  // 0(n)
          // push at bottom of st
          while(st.size()>0){
             helper.push(st.pop());
          }
          st.push(x);
          while(helper.size()>0) {
            st.push(helper.pop());
          }
    }
    
    public int pop() {
       return st.pop();
    }
    
    public int peek() {
      return st.peek();
    }   
    // }
    
    // public void push(int x) {
    //     st.push(x);
    // }
    
    // public int pop() {
    //     // st ka bottom remove karne ke liye;;
    //     while(st.size() > 1) {
    //         helper.push(st.pop());
    //     }
    //     // st se delete krayenge usko kahi store krayenge;;
    //     int front = st.pop();
    //     while(helper.size() > 0) {
    //         st.push(helper.pop());
    //     }
    //     return front;
    // }
    
    // public int peek() {
    //     while(st.size() > 1) {
    //         helper.push(st.pop());
    //     }
    //     int front  = st.peek();
    //     while(helper.size() > 0) {
    //         st.push(helper.pop());
    //     }
    //      return front;
    // }
    
    public boolean empty() {
        return (st.size()==0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna