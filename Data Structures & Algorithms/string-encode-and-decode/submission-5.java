class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            String str=strs.get(i);
            int len=str.length();
            sb.append(len);
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            for(;j<i+3;j++){
                if(str.charAt(j)=='#'){
                    break;
                }
            }
            int dig=j-i;
            int len=Integer.parseInt(str.substring(i,j));
            String st=str.substring(i+dig+1,i+dig+1+len);
            ans.add(st);
            i=i+dig+1+len;
        }

        return ans;
    }
}
