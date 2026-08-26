// ======================================
// LeetCode Problem: cheapest flights within k stops
// Language: java
// Link: https://leetcode.com/problems/cheapest-flights-within-k-stops/
// Synced by: LinkCode
// Date: 26/8/2026, 2:06:55 pm
// ======================================


class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int INF = 100000000;
        int[] dist = new int[n];
        Arrays.fill(dist ,INF);
        dist[src] = 0;
        for(int i = 0 ; i<=k ; i++){
            int[] temp = dist.clone();
            for(int[] flight : flights){
                int u = flight[0];
                int v = flight[1];
                int price = flight[2];
                 if (dist[u] != INF && dist[u] + price < temp[v]){
                    temp[v] = dist[u] + price;
                 }
            }
             dist = temp;
        }
        if(dist[dst] == INF){
            return -1;
        }
        return dist[dst];
    }
}