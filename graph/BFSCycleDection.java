package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSCycleDection {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("graph/edges.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph graph = new Graph(n);
        int i = 0;
        while (i < m) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdges(v, u);
            i++;
        }

        BFSCycleDection bfs = new BFSCycleDection();
        bfs.parent = new int[n];
        bfs.vis = new boolean[n];

        Arrays.fill(bfs.parent, -1);
        boolean cycle=false;
        for (int j = 0; j < n; j++) {
            if (!bfs.vis[j]) {
                
                if (bfs.bfsCycleDection(j,  graph))
                    cycle = true;
                }
            }
            if( cycle)
            System.out.println("Cycle Detected");
            else
        System.out.println("Cycle not Detected");
    }
    
    boolean[] vis ;
    int[] parent;
    public boolean bfsCycleDection(int node, Graph graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        vis[node] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (Integer nb : graph.adj.get(current)) {
                if (!vis[nb]){
                    vis[nb]=true;
                    parent[nb]= current;
                    queue.offer(nb);

                }
                else if (parent[current] != nb)
                    return true;
            }
        }
        return false;
    }
}
