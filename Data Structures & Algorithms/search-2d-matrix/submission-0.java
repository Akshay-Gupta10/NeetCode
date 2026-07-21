class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int lp=0;
        int rp=m*n-1;

        while(lp<=rp){
            int mid=(lp+rp)/2;
            int row=mid/n;
            int col=mid%n;

            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) rp=mid-1;
            else lp=mid+1;
        }
        return false;
    }
}
