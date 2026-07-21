class Solution {
    public int search(int[] nums, int target) {
        int idx=-1;
        int n=nums.length;
        int lp=0;
        int rp=n-1;

        while(lp<=rp){
            int mid=(lp+rp)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) rp=mid-1;
            else lp=mid+1;
        }
        return idx;
    }
}
