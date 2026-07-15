class Solution {
    class Pair{
        int first;
        int sec;

        Pair(int first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.sec-a.sec);

        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(int it:map.keySet()){
            Pair p=new Pair(it,map.get(it));
            pq.add(p);
        }

        int ans[]=new int[k];
        int idx=0;
        while(k!=0){
            ans[idx++]=pq.poll().first;
            k--;
        }

        return ans;
    }
}
