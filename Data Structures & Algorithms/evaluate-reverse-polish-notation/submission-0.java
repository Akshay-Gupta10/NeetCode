class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();

        for(String str:tokens){
            if(str.equals("+") || str.equals("-") || 
            str.equals("*") || str.equals("/")){
                int val1=stk.pop();
                int val2=stk.pop();

                if(str.equals("+")){
                    stk.push(val1+val2);
                }
                else if(str.equals("-")){
                    stk.push(val2-val1);
                }
                else if(str.equals("*")){
                    stk.push(val1*val2);
                }
                else{
                    stk.push(val2/val1);
                }
            }
            else{
                int val=Integer.parseInt(str);
                stk.push(val);
            }
        }

        return stk.pop();
    }
}
