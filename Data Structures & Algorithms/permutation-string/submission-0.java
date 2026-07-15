class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        if(m>n) return false;
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }

        int lp=0;
        int rp=0;

        while(rp<n){
            char ch=s2.charAt(rp);
            freq2[ch-'a']++;
            if(rp-lp+1>m){
                char c=s2.charAt(lp);
                freq2[c-'a']--;
                lp++;
            }
            if(rp-lp+1==m){
                if(Arrays.equals(freq1,freq2)==true) return true;
            }
            rp++;
        }
        return false;
    }
}
