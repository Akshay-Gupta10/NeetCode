class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        
        HashMap<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            int freq[]=new int[26];
            for(char ch:str.toCharArray()){
                freq[ch-'a']++;
            }

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(freq[i]);
                sb.append(" ");
            }

            String key=sb.toString();
            if(map.containsKey(key)){
                List<String> list=map.get(key);
                list.add(str);
                map.put(key,list);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }

        List<List<String>> ans=new ArrayList<>();
        for(String key:map.keySet()){
            List<String> list=new ArrayList<>();
            for(String s:map.get(key)){
                list.add(s);
            }
            ans.add(list);
        }

        return ans;
    }
}
