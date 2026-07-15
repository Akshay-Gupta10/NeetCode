class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();

        int ans=0;
        int lp=0;
        int rp=0;
        while(rp<n){
            char ch=s.charAt(rp);
            if(map.containsKey(ch)){
                while(lp<rp){
                    char ch2=s.charAt(lp);
                    lp++;
                    if(ch2==ch){
                        break;
                    }
                    map.remove(ch2);    
                }
            }
            else{
                map.put(ch,rp);
            }
            int len=rp-lp+1;
            ans=Math.max(ans,len);
            rp++;
        }

        return ans;
    }
}
