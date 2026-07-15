class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int lp=0;
        int rp=n-1;

        while(lp<rp){
            int sum=numbers[lp]+numbers[rp];
            if(sum==target){
                return new int[]{lp+1,rp+1};
            }
            else if(sum>target){
                rp--;
            }
            else{
                lp++;
            }
        }

        return new int[]{};
    }
}
