class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int it:nums){
            map.put(it,1);
        }

        int cnt=0;
        int prev=(int)1e9;
        int maxi=0;
        boolean flag=false;
        for(int it:map.keySet()){
            if(flag==false){
                flag=true;
                prev=it;
                cnt=1;
            }
            else{
                if(it==prev+1){
                    cnt++;
                }
                else{
                    cnt=1;
                }
            }
            prev=it;
            maxi=Math.max(maxi,cnt);
        }

        return maxi;
    }
}
