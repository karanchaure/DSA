package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<List<Integer>> adj;

    public Graph(int V) {
        this.adj = new ArrayList<>(V);
        for(int i = 0; i< V ; i++)
            this.adj.add(i, new ArrayList<>());
    }

    public void addEdges(int v, int u){
        this.adj.get(u).add(v);
        this.adj.get(v).add(u);
    }
    
}
