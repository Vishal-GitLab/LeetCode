class Solution {
    public int evalRPN(String[] tokens) {
        String expStr = "*/-+";
        Stack<Integer> st = new Stack<>();

        for(int  i = 0; i < tokens.length; i = i+1) {
            String token  = tokens[i];

            // '+', '-', '*', and '/'
            if(expStr.contains(token)) {
                // complete the result and push it back into the home 

                int op2 = st.pop();
                int op1 =  st.pop();
                int val  = 0;
                switch(token) {
                    case "+" :
                    val = op1  + op2;
                     break;
                    case "-" :
                    
                    val = op1  - op2;
                     break;
                    case "*" :
                    val = op1  * op2;
                     break;
                    case "/" :
                    val = op1  / op2;
                     break;
                }
                st.push(val);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna