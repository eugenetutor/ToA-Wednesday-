package DataStructure;

import java.util.Arrays;

public class KruskalAlgo {
    class Edge implements Comparable<Edge>{
        int src, dest, weight;
        @Override
        public int compareTo(Edge o) {
            return 0;
        }
    }
    int V, E;
    Edge edge[];

    public KruskalAlgo(int v, int e, Edge[] edge) {
        V = v;
        E = e;
        this.edge = new Edge[E];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    int find(int parent[], int i){
        if(parent[i] == -1)
            return i;
        return  find(parent, parent[i]);
    }

    void Union(int parent[], int x, int y){
        int xset = find(parent, x);
        int yset = find(parent,y);
        parent[xset] = yset;
    }

    void kruskalMST(){
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;

        Arrays.sort(edge);
        int parent[] = new int[V];
        Arrays.fill(parent, -1);
        while (e < V - 1){
            Edge next_edge = edge[i++];
            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.dest);

            if(x != y){
                result[e++] = next_edge;
                Union(parent, x, y);
            }
        }
        System.out.println("Minimum spanning tree: ");
        for (int j = 0; j < e; j++) {
            System.out.println(result[i].src + " -- "+ result[i].dest + " weight:" + result[i].weight);
        }
    }

    public static void main(String[] args) {

    }
}
