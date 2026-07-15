class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;

        int max=0;
        int lp=0;
        int rp=n-1;

        while(lp<rp){
            int wd=rp-lp;
            int ht=Math.min(heights[lp],heights[rp]);
            int area=wd*ht;
            max=Math.max(max,area);


            if(heights[lp]<=heights[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
}
