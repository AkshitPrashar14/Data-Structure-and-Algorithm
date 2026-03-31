import java.util.*;

class Solution {
    public int networkDelayTime(int[][] t, int n, int k) {
        List<List<int[]>> g = new ArrayList<>();
        for(int i=0;i<=n;i++) g.add(new ArrayList<>());

        for(int[] x: t) g.get(x[0]).add(new int[]{x[1],x[2]});

        int[] d = new int[n+1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[k]=0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});

        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int u = cur[0], time = cur[1];

            if(time>d[u]) continue;

            for(int[] nei: g.get(u)){
                int v = nei[0], w = nei[1];
                if(d[u]+w < d[v]){
                    d[v] = d[u]+w;
                    pq.add(new int[]{v,d[v]});
                }
            }
        }

        int ans=0;
        for(int i=1;i<=n;i++){
            if(d[i]==Integer.MAX_VALUE) return -1;
            ans = Math.max(ans,d[i]);
        }

        return ans;
    }
}
