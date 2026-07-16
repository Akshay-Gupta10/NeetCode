class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stk=new Stack<>();
        int n=arr.length;

        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()){
                int idx=stk.peek();
                if(arr[idx]>arr[i]){
                    ans[i]=idx-i;
                    break;
                }
                stk.pop();
            }
            if(stk.isEmpty()) ans[i]=0;
            stk.push(i);
        }
        return ans;
    }
}
