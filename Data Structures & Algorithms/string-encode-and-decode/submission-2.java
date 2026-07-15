class Solution {
    StringBuilder sb=new StringBuilder();
    public String encode(List<String> strs) {
        for(String st:strs){
            if(st.equals("")){
                sb.append("Akshay");
            }
            else sb.append(st);
            sb.append("akshay");
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        if(str.length()==0) return ans;
        String arr[]=str.split("akshay");

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Akshay")){
                ans.add("");
            }
            else ans.add(arr[i]);
        }
        return ans;
    }
}
