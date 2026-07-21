class Solution {
    public boolean solve(int nums[],int cap,int k){
        int cnt=0;
        for(int it:nums){
            cnt+=(it/k)+(it%k==0?0:1);
        }
        return cap>=cnt;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int lp=1;
        int rp=Arrays.stream(piles).max().getAsInt();

        int ans=-1;
        while(lp<=rp){
            int mid=(lp+rp)/2;
            if(solve(piles,h,mid)){
                ans=mid;
                rp=mid-1;
            }
            else{
                lp=mid+1;
            }
        }
        return ans;
    }
}
