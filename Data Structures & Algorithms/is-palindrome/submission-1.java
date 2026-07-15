class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        int n=s.length();
        
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            while(lp<rp && !Character.isLetterOrDigit(s.charAt(lp))){
                lp++;
            }
            while(lp<rp && !Character.isLetterOrDigit(s.charAt(rp))){
                rp--;
            }

            if(lp>=rp) break;

            if(s.charAt(lp)!=s.charAt(rp)) return false;
            lp++;
            rp--;
        }
        return true;
    }
}
