import java.util.*;

public class BridgeInGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create graph with the given number of vertices (V)
    public static void createGraph(ArrayList<Edge> graph[], int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph (making it undirected by adding edges in both directions)
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));
        graph[0].add(new Edge(0, 3));
        graph[3].add(new Edge(3, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
        graph[3].add(new Edge(3, 5));
        graph[5].add(new Edge(5, 3));

        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));
    }

    // DFS function to find bridges
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int[] time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0]; // Increment time and set discovery and low time

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            // If the neighbor is the parent, continue
            if (neigh == par) {
                continue;
            }
            // If the neighbor is not visited
            if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, vis, time);

                // Update the low time of the current node
                low[curr] = Math.min(low[curr], low[neigh]);

                // Check if the edge from curr to neigh is a bridge
                if (dt[curr] < low[neigh]) {
                    System.out.println("Bridge found: " + curr + " --- " + neigh);
                }
            } else {
                // Update the low time of the current node based on the discovery time of the neighbor
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    // Tarjan's algorithm for finding bridges
    public static void tarjanBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V]; // Discovery times
        int[] low = new int[V]; // Low times
        boolean[] vis = new boolean[V]; // Visited nodes
        int[] time = {0}; // Time reference

        // Perform DFS from each unvisited node
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        tarjanBridge(graph, V);
    }
}
